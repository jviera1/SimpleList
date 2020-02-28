package cse360assign2;

import java.util.Scanner;

import cse360assign2.SimpleList;

public class main2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String choice; 
		int option = 0; 
		int num = 0;
		SimpleList ref = new SimpleList(); 
		do 
		{
			System.out.println("What would you like to do?");
			System.out.println("1 - Add a number to the list");
			System.out.println("2 - Remove a number from the list");
			System.out.println("3 - Count the number of elements in the list"); 
			System.out.println("4 - toString");  
			System.out.println("5 - Search for a number in the list"); 
			System.out.println("6 - Append an integer to this list");
			System.out.println("7 - See the first integer in the list");
			System.out.println("8 - See the last integer in the list");
			System.out.println("9 - See the size of the list");
			
			System.out.println("Enter your choice:");
			option = scan.nextInt(); 
			
			switch(option) 
			{
			case 1:
				System.out.println("Enter an integer: ");
				num = scan.nextInt(); 
				ref.add(num);
				ref.display();
				break;
				
			case 2:
				System.out.println("Enter an integer: ");
				num = scan.nextInt();
				ref.remove(num);
				ref.display();
				break; 
				
			case 3: 
				System.out.println("Number of elements in the array: ");
				System.out.println(ref.count());
				ref.display();
				break;
				
			case 4:
				System.out.println("Converting array to string...");
				System.out.println(ref.toString());
				ref.display();
				break; 
			case 5: 
				System.out.println("Enter an integer: "); 
				num = scan.nextInt(); 
				System.out.println("The element you seek is in index: ");
				System.out.println(ref.search(num));
				ref.display();
				break; 
				
			case 6: 
				System.out.println("Enter an integer: ");
				num = scan.nextInt(); 
				ref.append(num);
				ref.display();
				break; 
				
			case 7: 
				System.out.println("This is the first integer in the list: ");
				if(ref.first() < 0 ) 
				{
					System.out.println("Oops! The list is empty!");
				}
				else 
				{
					System.out.println(ref.first());
				}
				break; 
				
			case 8: 
				System.out.println("This is the last integer in the list: ");
				if(ref.last() < 0 ) 
				{
					System.out.println("Oops! The list is empty!");
				}
				else 
				{
					System.out.println(ref.last());
				}
				break; 
				
			case 9: 
				System.out.println("This is the size of the list: ");
				System.out.println(ref.size());
				break; 
			}
			
					choice= "y";
		//ref.last();
		}while(choice != "n"); 

	}
}
