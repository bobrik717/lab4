package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("PrivatBank");
        Bank.Account account = bank.new Account(324238762);
        account.show();
    }
}
