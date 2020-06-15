package Proyecte;

import java.util.HashMap;
import java.util.List;

import Proyecte.client.Client;

public class AccountDto {
    public final String client;
    public final String phoneNumber;
    public final String balance;
    public final String accoundType;
    public final HashMap<String, HashMap<String, Object>> receivables;

    public AccountDto(String client, String phoneNumber, String balance, String accoundType,
            HashMap<String, HashMap<String, Object>> receivables) {
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.accoundType = accoundType;
        this.receivables = receivables;
    }

    
    
    
}