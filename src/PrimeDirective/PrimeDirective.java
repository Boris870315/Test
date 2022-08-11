package PrimeDirective;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeDirective {

		 // Add your methods here:

	public static boolean isPrime(Integer n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	  
		  
		  public static void main(String[] args) {

		    PrimeDirective pd = new PrimeDirective();
		    Integer[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
		    
		    List<Integer> numberList = Arrays.asList(numbers);  
		    List<Integer> onlyPrime = new ArrayList<Integer>();
		    //System.out.println(numberList.retainAll(numberList));
		    for(int i =0; i<numberList.size();i++) {
		    	
		    System.out.print(numberList.get(i)+" is prime number: ");
		    System.out.println(pd.isPrime(numberList.get(i)));
		    if (pd.isPrime(numberList.get(i)))
		    	onlyPrime.add(numberList.get(i));
		    }
		    System.out.println(onlyPrime);

	}

}