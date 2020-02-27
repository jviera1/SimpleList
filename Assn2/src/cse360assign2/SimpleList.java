package cse360assign2;

public class SimpleList 
{
	private  int count;  
	private int list[]; 
	public int num; 
	
	public SimpleList() 
	{
		// Define variables in the constructor 
		count = 0; 
		list = new int [10]; 
		num = 0;
	}
	
	public  void add(int n) 
	{
		// If the list is empty, add it in the first index
		if(list[0] == 0 && count == 0) 
		{
			list[0] = n; 
		}
		
		// If the list is not empty, shift all the elements to the left and 
		// place the input in the first index of that array. 
		else 
		{
			for(int i = list.length-2; i >= 0; i--) 
			{
				list[i+1] = list[i]; 
			}
			
			list[0] = n;
		}
		
		// Keep track every time an element is added to the array. 
		count++;
	}
	
	public void remove (int n) 
	{
		// if the number is at the front of the list 
		if(list[0] == n) 
		{
			list[0]=0; 
		}
		
		// look for the occurrences throughout the array
		else 
		{
			num = 0; // Keep track of how many occurrences of that integer there are in the array
			
			for(int i = 0; i<list.length-1; i++) 
			{
				if(list[i] == n) 
				{
					count-=1; //decrease the count for every item removed 
					num++;
					list[i] = 0;
				}
			}
			// if the number to be removed is not in the array
			if(num == 0) 
			{
				System.out.println("Number does not exist in array");
			}
		}
		
		// Fix the spacing in the array
		
		for(int i = 0; i < list.length-2; i++) 
		{
			if(list[i] == 0) 
			{
				list[i] = list[i+1];
				list[i+1]=0;
			}
		}
	}
	
	// Manage the inputs in the array
	public int count() 
	{
		// If add() is used consecutively more than 10 times, count shouldn't exceed 10
		if(count>=10) 
		{
			count = 10; 
		}
		// If remove() is used consecutively more that 10 times, count shouldn't be less that 0
		if (count<=0) 
		{
			count = 0; 
		}
		return count; 
	}
	
	
	// Convert the array into a string 
	public String toString() 
	{
		
		String lastString = null; 
		StringBuffer sbuff = new StringBuffer(); 
		String arr[] = new String[9];
		
		// Move the elements into a string array 
		for (int i = 0; i < list.length-1; i++) 
		{
			arr[i] = Integer.toString(list[i]);
		}
		
		
		// Create a string buffer and move the elements of the array into it
		for(int i = 0; i<arr.length-1; i++) 
		{
			sbuff.append(arr[i]); 
		}
		
		//store the buffer into a string
		lastString = sbuff.toString(); 
		return lastString; 
	}
	
	// Search for an element in the array, return the index of its location 
	public int search(int n) 
	{
		
		// traverse through the array 
		for(int i = 0; i < list.length; i++) 
		{
			// return the index if it is found 
			if(list[i] == n) 
			{
				return i; 
			}
		}
		
		// return -1 if the element is not in the array 
		return -1; 
	}
	
	
	// display the array as it is right now (not used in Junit testing
	public void display() 
	{
		System.out.println("Here is the arrray now: "); 
		for(int i = 0; i<list.length; i++) 
		{
			System.out.print(list[i]);
		}
		
		System.out.println("\n");
	}
	
	
	// return the last index of the array
	public int lastIndex() 
	{
		return list[9];
	}
}
