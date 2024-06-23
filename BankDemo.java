package tnsif.one;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            BankAccount account = new BankAccount("pratik", 2000);
            System.out.println(account);
            account.withdraw(200);
            System.out.println(account);
            account.withdraw(50); // This should throw LowBalanceException
            System.out.println(account);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
	}

}
