package ahneeka.account;

public class AccountDriver {
    public static void main(String[] args) {
        Account account = new Account();

        account.setName("Nneka");

        System.out.printf("Name: %s%nBalance: %f%nAge: %d%n",
                account.getName(), account.getBalance(), account.getAge());
    }
}
