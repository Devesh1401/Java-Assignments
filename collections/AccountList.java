package collections;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

	public static void main(String[] args) {
		
		List<Account> listAcc = new ArrayList<Account>();
		
		listAcc.add(new Account("Liam", 101, 50000));
		listAcc.add(new Account("Alaistair", 102, 10000));
		listAcc.add(new Account("Ian", 103, 80000));
		listAcc.add(new Account("Ben", 104, 70000));
		System.out.println(listAcc);
		System.out.println(listAcc.size());
		
		listAcc.remove(3);
		System.out.println(listAcc);
		System.out.println(listAcc.size());
		
		listAcc.set(2, new Account("Mark", 103, 30000));
		System.out.println(listAcc);
		System.out.println(listAcc.size());
		
		System.out.println(listAcc.contains(new Account("Alaistair", 102, 10000)));
		
		
		
		

	}

}
