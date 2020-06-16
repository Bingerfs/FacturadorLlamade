package Proyecte;

public class AccountService implements AccountBoundaryIn {
    private IAccountRepository accountRepository;

    
    @Override
    public void createAccount(Account account) {
        accountRepository.createAccount(account);
    }

    public AccountService(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
}