/*Write a Java program to append the specified element
to the end of a linked list*/


package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class Q4Collection {
	
	public static void main(String[] args) {
		LinkedList list= new LinkedList(Arrays.asList(25,3,4,7,1));
		System.out.println(list);
		
		list.addLast(0);
		
		System.out.println(list);
		
	}
	


}

