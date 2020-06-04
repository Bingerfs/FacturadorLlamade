package Proyecte;

public interface IAccountRepository {
    Account getAccountByPhoneNumber(String phoneNumber);
    void createAccount(Account account);
}