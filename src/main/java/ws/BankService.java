package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BankWs")
public class BankService {

    @WebMethod(operationName = "convertEuroToDirham")
    public double convertEuroToDirham(@WebParam(name = "amount") double amount) {
        return amount * 11;
    }

    @WebMethod
    public double convertDirhamToEuro(@WebParam double amount) {
        return amount / 11;
    }

    @WebMethod
    public Account getAccount(@WebParam String accountNumber) {
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setOwner("John Doe");
        account.setBalance(1000);
        return account;
    }

    @WebMethod
    public List<Account> getAccounts() {
        return List.of(
                new Account("123", "John Doe", (Math.random()*1000)+1000),
                new Account("456", "Jane Doe", (Math.random()*1000)+2000),
                new Account("789", "Jim Doe", (Math.random()*1000)+3000)
        );
    }
}
