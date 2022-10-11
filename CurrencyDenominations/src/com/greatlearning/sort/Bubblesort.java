package com.greatlearning.sort;

public class Bubblesort {

	
	public Bubblesort(int[] currency)
    {
        int temp;
        for (int i = 0; i < currency.length;i++)
        {
            for (int j = 0; j < currency.length-1-i; j++)
            {
                if (currency[j] < currency[j + 1])
                {
                    temp=currency[j];
                    currency[j]=currency[j + 1];
                    currency[j + 1] = temp;
                }
            }
        }
    }
}
