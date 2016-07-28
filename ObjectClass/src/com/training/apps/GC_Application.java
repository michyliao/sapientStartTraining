package com.training.apps;

import com.training.domains.*;
import com.training.exceptions.RangeCheckException;

public class GC_Application {

	public static void main(String[] args){
		
		try{
			
		
			Book bk = new Book(101, "Poop", "Mr Poop", 100.00);
			
			System.out.println(bk);
			
			bk = null;
			
			System.gc();
			
			System.out.println("Look at console for Message");
			System.out.println("BAIIIIIIIIIIII");
		} catch (RangeCheckException e){
			System.out.println(e.getMessage());
		}
	}
	
}
