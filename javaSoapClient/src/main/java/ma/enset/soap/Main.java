package ma.enset.soap;

import proxy.bank.BankService;
import proxy.bank.BankWs;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankWs().getBankServicePort();
        System.out.println("................................");
        System.out.println(bankService.convertEuroToDirham(55));
        System.out.println(bankService.convertDirhamToEuro(2000));
        System.out.println("................................");
        System.out.println("Accounts:");
        for (var account : bankService.getAccounts()) {
            System.out.println(account.getAccountNumber());
            System.out.println(account.getOwner());
            System.out.println(account.getBalance());
            System.out.println("............------...............");
        }
        System.out.println("................................");
        var account = bankService.getAccount("123");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());
    }
}
