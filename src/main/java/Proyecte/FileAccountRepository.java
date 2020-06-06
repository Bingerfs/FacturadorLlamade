package Proyecte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class FileAccountRepository implements IAccountRepository {

    private String fileName;
    private String fileNameReceivables;
    private IClientRepository clientRepository;

    FileAccountRepository(String fileName, String fileNameReceivables, IClientRepository clientRepository) {
        this.fileName = fileName;
        this.fileNameReceivables = fileNameReceivables;
        this.clientRepository = clientRepository;
    }

    @Override
    public void createAccount(Account account) {
        try {

            // clientFile.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            String line = account.phoneNumber + ", " + account.balance + ", " +  account.accoundType + ", " ;
            if(clientRepository.getClientByCi(account.client.ci) != null){
                line = line + account.client.ci;
                out.write(line);
                out.newLine();
                BufferedWriter outR = new BufferedWriter(new FileWriter(fileNameReceivables, true)); 
                line = new String();
                for(Receivable receivable : account.receivables){
                    line = account.phoneNumber + ", " + receivable.getClass().getSimpleName();
                    for (Entry<String, Object> entry : receivable.getData().entrySet()) {
                        line= line + ", ";
                        line = line + entry.getValue().toString();
                    }
                    outR.write(line);
                    outR.newLine();
                }
                outR.close();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Account getAccountByPhoneNumber(String phoneNumber) {
        Account account = null;
        List<Receivable> receivables = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str = "";
            BufferedReader inR = new BufferedReader(new FileReader(fileNameReceivables));
            while ((str = in.readLine()) != null) {
                String[] accountData = str.split(", ");
                if(phoneNumber.equals(accountData[0])){
                    str = "";
                    while ((str = inR.readLine()) != null){
                        String[] receivableData = str.split(", ");
                        if(phoneNumber.equals(receivableData[0])){
                            if(receivableData[1].equals("FriendsReceivable"))
                                receivables.add(new FriendsReceivable(receivableData[2]));
                        }
                    }
                    account = new Account(clientRepository.getClientByCi(accountData[3]), accountData[0], receivables, accountData[2]);
                    break;
                }
            }
            inR.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }
    
}