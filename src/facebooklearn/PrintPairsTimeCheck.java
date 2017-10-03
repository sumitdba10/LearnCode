package facebooklearn;

public class PrintPairsTimeCheck {
	
	public void printPairFun(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println(array[i] +", "+ array[j]);
			}
		}
	}

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		// TODO Auto-generated method stub
        int array[] = {1,2,3,4,5,6,7,8,9,10};
		PrintPairsTimeCheck pairtest = new PrintPairsTimeCheck();
		
		pairtest.printPairFun(array);
		
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);
		
		
		
	}

}
