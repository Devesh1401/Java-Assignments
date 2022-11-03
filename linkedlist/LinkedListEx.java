package linkedlist;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



public class LinkedListEx {

	public static void main(String[] args) {
		
		Queue<Account> ll = new LinkedList<Account>();
		
		ll.offer(new Account("Liam", 101, 50000));
		ll.offer(new Account("Alaistair", 102, 90000));
		ll.offer(new Account("Eric", 103, 120000));
		ll.offer(new Account("Ben", 104, 30000));
		
		System.out.println(ll.size());
        System.out.println("peek:"+ll.peek());
        System.out.println(ll.size());
        
        System.out.println("poll:"+ll.poll());
        System.out.println(ll.size());
        
        System.out.println("poll:"+ll.poll());
        System.out.println(ll.size());
        
        Queue<Account> q = new PriorityQueue<Account>();
        
        q.offer(new Account("Liam", 101, 50000));
		q.offer(new Account("Alaistair", 102, 90000));
		q.offer(new Account("Eric", 103, 120000));
		q.offer(new Account("Ben", 104, 30000));
		
		System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
		
	}

}
