/**
 * 
 */
package facebooklearn;

/**
 * @author sumitkannu
 *
 */
public class TimeCheck {
	  
	
	public static void main(String args[]){
		final long startTime = System.nanoTime();
		
		int n=5;
	         for(int i=10; i>n; i--){
	              System.out.println("The value of i is: "+i);
	         }
		
	 		final long duration = System.nanoTime() - startTime;
			System.out.println(duration);
			
			SumProductTimeCheck s = new SumProductTimeCheck();
			System.out.println(s.a);

}
}