package collections;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
        List<Integer> lst = new ArrayList<Integer>();
        
        
        
        lst.add(80);  // new Integer(80) -- autoboxing - box the primitve into object type
        lst.add(30);
        
    //    lst.add("java");
        lst.add(10);
        lst.add(1);
        
        
         System.out.println(lst);   //lst.toString();
        
         System.out.println(lst.size());
         
         int no = lst.get(0); //  new Integer(100).intvalue() -- auto-unboxing - unbox Integer object to its primitive value
         System.out.println("value at index position 0:"+no);
         
         System.out.println(lst); 
         System.out.println(lst.size());
         
          lst.remove(0);
          
          System.out.println(lst);   
          System.out.println(lst.size());
          
          lst.set(0,130);
          System.out.println(lst); 
          System.out.println(lst.size());
          
          List<String> batsman = new ArrayList<String>();
          
          batsman.add("A.B.Devilliers");
          batsman.add("M.S.Dhoni");
          batsman.add("Liam Livingtone");
          batsman.add("Virat Kohli");
          
          System.out.println(batsman);
          System.out.println(batsman.size());
          
          batsman.remove(3);
          System.out.println(batsman);
          System.out.println(batsman.size());
          
          batsman.set(1, "Harry brook");
          System.out.println(batsman);
          System.out.println(batsman.size());
          
          batsman.add("Rishabh Pant");
          System.out.println(batsman);
          System.out.println(batsman.size());
          

	}

}
