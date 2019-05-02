package model;

public class RecursiveFunctions {

	public static int factorial(int numero) {
		if (numero <= 1)
			return 1;
		else
			return numero * factorial(numero - 1);
	}

	public static long fibonacci(long n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static int arraySumatory(int[] a) {
		return arraySumatory(a,a.length-1);
	}
	
	private static int arraySumatory(int[] a,int n) {
		if(n==0)
			return a[0];
		else 
			return a[n]+arraySumatory(a,n-1);
	}

}
