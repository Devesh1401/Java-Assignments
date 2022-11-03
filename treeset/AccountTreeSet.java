package treeset;


import java.util.SortedSet;
import java.util.TreeSet;



public class AccountTreeSet {

	public static void main(String[] args) {
		
		SortedSet<Account> setAcc = new TreeSet<Account>();
		
		setAcc.add(new Account("Liam", 101, 50000));
		setAcc.add(new Account("Alaistair", 110, 10000));
		setAcc.add(new Account("Ian", 103, 80000));
		setAcc.add(new Account("Ben", 200, 70000));
		System.out.println(setAcc);
		System.out.println(setAcc.size());
		
	}

}
