package Recursion;

public class Factorial {
	public static long getNFactorial(long n){
	      if(n==0){
	          return 1;
	      }
	      return n*getNFactorial(n-1);
	  }
}
