package Proyecte;

import java.util.List;

public class Account {
    Client client;
    String phoneNumber;
    String balance;
    String accoundType;
    List<Receivable> receivables;

    public Account(Client client, String phoneNumber, List<Receivable> receivables, String accountType) {
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.receivables = receivables;
        this.accoundType = accountType;
        this.balance = "0";
    }

    void AddReceivable(Receivable receivable){
        receivables.add(receivable);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public List<Receivable> getReceivables() {
        return receivables;
    }

    public void setReceivables(List<Receivable> receivables) {
        this.receivables = receivables;
    }

    
    

    


    
}