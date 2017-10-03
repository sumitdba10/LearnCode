package facebooklearn;

public class FibonnaciCodeFirst {

	void allFib(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(fib(i));
		}
	}

	int fib(int n) {

		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (fib(n - 1) + fib(n - 2));

	}

	public static void main(String[] args) {
		FibonnaciCodeFirst xyz = new FibonnaciCodeFirst();
		System.out.println(xyz.fib(5));
		xyz.allFib(5);	

	}

}
