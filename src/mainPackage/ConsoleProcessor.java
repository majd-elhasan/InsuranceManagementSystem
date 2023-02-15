package mainPackage;


import account.Account;
import account.AccountManager;

import java.util.Scanner;

public class ConsoleProcessor {
    static Scanner scanner = new Scanner(System.in);
    public static Account in(AccountManager accountManager) {
        System.out.print("enter the email : ");
        String email = scanner.nextLine();
        System.out.print("enter the password : ");
        String password = scanner.nextLine();
        return accountManager.login(email,password);
    }

}
