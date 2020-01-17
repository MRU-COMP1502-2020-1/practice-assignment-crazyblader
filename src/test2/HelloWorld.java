package test2;

public class HelloWorld {
	public static void main (String[] args) {
		System.out.println(isPrime(2));
	    System.out.println(isPrime(3));
	    System.out.println(isPrime(4));
	    System.out.println(isPrime(10));
	    System.out.println(isPrime(11204));
	    System.out.println(isPrime(12));
	}
	
	public static boolean isPrime(int num){
	    boolean isPrime = true;
	    //if isDivisible is true, the num is deemed as a composite number i.e not a prime
	    for (int i = 2; i < num; i++){
	      if (isDivisible(num, i)){
	        isPrime = false;
	        break;
	      }
	    }
	    
	    return isPrime;
	    }
	
	public static boolean isDivisible(int dividend, int divisor){
	    if (dividend % divisor == 0){
	      return true;
	    } else return false;
	  }

}
