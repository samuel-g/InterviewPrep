/**
 * "Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz”." 1,2,3,Fizz,4,Buzz,Fizz,7,8,Fizz..
 * 
 * @author samue
 *
 */
public class FizzBuzz {

	public String printFizzBuzz(int num) {
		if (num % 15 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(num);
	}

}
