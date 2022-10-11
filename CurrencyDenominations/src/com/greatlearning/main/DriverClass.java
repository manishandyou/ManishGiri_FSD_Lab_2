package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.service.CountingOfNotes;
import com.greatlearning.sort.Bubblesort;

public class DriverClass

{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denomination");
		
		int size=sc.nextInt();
		 
		int currency[]=new int[size];
		
		for(int i=0;i<size;i++)
		
		{
			 
			System.out.println("Enter the Currency Denomination Value");
			currency[i]=sc.nextInt();
		 
		 }
		
		 Bubblesort bs=new Bubblesort(currency);
		
		 System.out.println("\n");
		 
		 System.out.println("Enter the amount you want to pay");
		 
		 int amount=sc.nextInt();
		  
		 CountingOfNotes nc = new CountingOfNotes();
		 nc.counting(currency,amount);
		 
		 sc.close();
		 
	}
	
}
