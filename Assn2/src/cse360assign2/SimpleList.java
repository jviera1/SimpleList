/*Author: 			Joshua E. Viera
 *Class ID: 		373
 *Assignment: 		2
 *
 * 
 * Description: 
 * This program creates an array of 10 integers. It contains five methods that will manipulate the array in different ways. The add() method will add 
 * elements to the array while increasing the size of the array once it is full. The remove() method will accept an integer as an input and remove all the instances
 * of that integer from the array, and shift all the values to the left of the array. If the array is more than 25% empty, then it will reduce the size of the array. 
 * The toString() method converts the integer array into a single string.The count() method is used to keep track of the total elements in the array. The search() 
 * method searched for an element in the array and returns the index where that value is stored. The lastIndex() method returns the last element in the array. 
 */



package cse360assign2;


public class SimpleList 
{
	private  int count;  
	private boolean track;  // use this to keep track of the first time you input more than 10 integers to the list  
	private int list[];
	private int list2[];
	public int size; 
	public int num; 
	
	public SimpleList() 
	{
		// Define variables in the constructor 
		count = 0; 
		list = new int [10]; 
		track = false; 
		size = 0; 
		num = 0;
	}
	
	public  void add(int n) 
	{
		// If the list is already full, increase its size by 50% 
		// This will only account for the first time the list is full 
		if(count >= 10) 
		{
			track = true; 
			
			// Set the size of arrayList
			list2 = new int[list.length + list.length/2];
				
			// Traverse through list, add everything to list2 			   
		    for(int i = 0; i<list.length; i++) 
		    {
		    	list2[i] = list[i];
		    }
		    
		    
			// Now add something into the new array. 
		    for(int i = list2.length-2; i >= 0; i--) 
			{
				list2[i+1] = list2[i]; 
			}
		
			list2[0] = n;
			
			list = list2; 
		}
		
		// This will account in the case that the list has already been full before
		else if (track == true) 
		{
			System.out.println("TBD");
		}
		
		// This will handle the first the inputs of the list only 
		else 
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
		}
		
			// Keep track every time an element is added to the array. 
			count++;	
			System.out.println(count);
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
		/*if(count>=10) 
		{
			count = 10; 
		}*/
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
		System.out.println("Here is the array now: "); 
			
	
	
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
