package account;

import mainPackage.AuthenticationStatus;
import mainPackage.InvalidAuthenticationException;
import java.util.TreeSet;

public class AccountManager {
    public AccountManager(){}
    TreeSet<Account> accounts = new TreeSet<>();

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
    public void clearAccounts(){this.accounts=new TreeSet<>();}

    public Account login(String email, String password){
        try {
            for (Account account : accounts){
                account.login(email,password);
                if (account.status.equals(AuthenticationStatus.SUCCESS)) return account;
            }
        }catch(InvalidAuthenticationException e){
            System.out.println(e);
        }
        return null;
    }
}
