package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class Applicaiton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Book bk = new Book(101, "How to runs", "Mr. Poop", 4500.00);
			
			Book bk2 = new Book(102, "How to duggy", "Mr Pee", 500.00);
	
			Book bk3 = new Book(102, "How to duggy", "Mr Pee", 500.00);
			
			System.out.println(bk2.equals(bk3));
			
			System.out.println(bk2.hashCode());
			System.out.println(bk3.hashCode());
			
			String s = new String("Haro");
			
			System.out.println("Comparing Objects of Different classes " + s.equals(bk2));
			
			Book bk4 = null;
			
			System.out.println("Comparing Null vlaues " + bk3.equals(bk4));
	
			Book bk5 = bk;
			
			System.out.println("Comparing Identity := " + bk5.equals(bk));

		}catch(RangeCheckException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
