import account.Account;
import account.AccountManager;
import account.individual;
import address.*;
import mainPackage.ConsoleProcessor;
import mainPackage.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user = new User("Mecid","elhasan","email","123",28);
        Address address = new HomeAddress("turkey","bursa","inegöl","alanyurt","millet caddesi","beyaz inci sitesi");
        AddressManager.addAddress(user,address);
        Account account = new individual(user);
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(account);
        Account resultAccount = ConsoleProcessor.in(accountManager);
        System.out.println(resultAccount);

    }
}