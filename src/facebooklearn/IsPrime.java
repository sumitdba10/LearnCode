package facebooklearn;

public class IsPrime {
	int n = 0;

	public boolean isPrimeNumber(int n) {

		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0) {
				return (false);
			}
			//System.out.println("Number is not prime");
		}
		
		return (true);
		//System.out.println("Number is Prime");

	}

	public static void main(String[] args) {

		IsPrime xyz = new IsPrime();
		System.out.println(xyz.isPrimeNumber(13));

	}

}
