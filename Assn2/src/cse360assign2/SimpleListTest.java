package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

class SimpleListTest {

	@Test
	void testAdd() 
	{
		// Based on the input, the first two inputs should have been kicked off the array, 
		// and count should still be 10 despite more than ten inputs. 
		 SimpleList ref = new SimpleList();
	
		 ref.add(1);
		 ref.add(2); 
		 ref.add(3);
		 ref.add(4);
		 ref.add(5); 
		 ref.add(6);
		 ref.add(7);
		 ref.add(8);
		 ref.add(9);
		 ref.add(10);
		 ref.add(11);
		 ref.add(12);
		 
		 assertTrue(ref.count() == 10);
		 assertTrue(ref.last()==3); 
	}
	
	@Test 
	void testRemove() 
	{
		// Based on the input, 2 should be shifted to the first index since the 4's have been removed 
		 SimpleList ref = new SimpleList();
		 ref.add(3);
		 ref.add(4);
		 ref.add(2);
		 ref.add(4);
		 ref.remove(4);
		 assertTrue(ref.search(2)==0);
		 
	}
	
	@Test 
	void testCount() 
	{
		// Based on the inputs, the counter should keep track 
		// of the adding and removing of the elements to show 3 elements in the array.
		
		 SimpleList ref = new SimpleList();
		 ref.add(3);
		 ref.add(4);
		 ref.remove(3);
		 ref.add(3);
		 ref.add(7);
		 assertTrue(ref.count() == 3);
		 
		 
	}
	
	@Test 
	void testtoString() 
	{
		// Based on the inputs, given the wrong comparison, the test should state that the converted string 
		// is not equal to the string given 
		 SimpleList ref = new SimpleList();
		 ref.add(3);
		 ref.add(3);
		 ref.add(4);
		 ref.add(4);
		 assertFalse(ref.toString().equals("3344"));

	}
	
	@Test 
	void testSearch() 
	{
		// Based on the inputs, 8 should be in the third index of the array 
		
		 SimpleList ref = new SimpleList();
		 
		 ref.add(3);
		 ref.add(4);
		 ref.remove(4);
		 ref.add(8);
		 ref.add(2);
		 ref.add(1);
		 ref.add(6);
		 assertTrue(ref.search(8)==3);
	}

}
