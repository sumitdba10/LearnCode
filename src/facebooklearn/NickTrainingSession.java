
package facebooklearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NickTrainingSession{
	
	Integer a = new Integer(1);
	

	public void runTimeTest(int[] array) {
		int sum = 0;
		int product = 1;
		
		//Collections.so
		
		
		System.out.println("comparing "+a.compareTo(new Integer(1)));
		
		System.out.println("here "+a);

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Total sum of array =" + sum);

		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println("Total product of array =" + product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final long startTime = System.nanoTime();
		
		
		Integer b = new Integer(1);
		int array[] = { 1, 2, 4, 3 };
		
		
		System.out.println(array.length);
		
		//System.out.println(array[5]);
		
		//int - Interger
		//double - Double
		//char - Character
		//bool - Boolean
		//float - Float
		//long - Long
		//byte - Byte
		//short - Short
		//String
		
		
		List<Integer> xyz = new ArrayList<Integer>();
/*		xyz.add(true);
		xyz.add(1);
		xyz.add("sumit");
		xyz.add("Nishant");*/
		xyz.add(1);
		xyz.add(2);
		
		
	//	xyz.size();
	//	xyz.isEmpty();
		xyz.get(0);
		
		Iterator a = xyz.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		

		NickTrainingSession test = new NickTrainingSession();

		test.runTimeTest(array);

		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);

	}

}
