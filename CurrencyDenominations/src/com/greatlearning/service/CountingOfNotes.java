package com.greatlearning.service;

public class CountingOfNotes{
	
	
	public void counting(int[] currency, int amountTarget)
	
	
	{
		
		int noteqty[] = new int[currency.length];
		int i;
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for(i = 0; i<currency.length; i++)
		
		{
			noteqty[i] = amountTarget/currency[i];
			
			amountTarget = amountTarget%currency[i];
			
		}
		
		for(i = 0; i<currency.length; i++)
		
		{
			
			if(noteqty[i]!= 0)
				
				System.out.println(currency[i] + ":" + noteqty[i]);
			
		}
		
		
	}
}
