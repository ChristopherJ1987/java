package java_1.dataTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class
		System.out.println("printMsg() Method: ");
		printMsg("hello world \n", 3);

		System.out.println("nthFibonacci() Method: ");
		nthFibonacci(7);

		System.out.println("calcPay() Method: ");
		calcPay(1, 250.00, 2);

		System.out.println("solveQuadratic() Method: ");
		solveQuadratic(4, 2, 3);

		System.out.println("countQuarters() Method: ");
		countQuarters(10.50);

		System.out.println("reverseString() Method: ");
		reverseString("Christopher");

		System.out.println("shuffleMessage() Method: ");
		String[] msg = new String[] {"hey", "there", "friend"};
		shuffleMessage(msg);

	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		System.out.println(msg.repeat(repeats));
	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */
		int f[] = new int[n + 1];
		int i = 0;
		f[0] = 0;
		if(n > 0){
			f[1] = 1;
			for(i = 2; i <= n; i++){
				f[i] = f[i - 1] + f[i - 2];
			}
		}
		System.out.println(f[n]);
		return f[n];
	}

	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		System.out.println("Total pay is as follows, and returned $" + hrsPerPeriod * hourlyRate * payPeriods + "0");
		return hrsPerPeriod * hourlyRate * payPeriods;
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */
		System.out.println((x*x) + y + z);
		return (x*x) + y + z;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		double numOfQuarters;
		numOfQuarters = amount / .25;
		System.out.println(numOfQuarters);
		return (int) numOfQuarters;
	}

	static String reverseString(String str) {
		//reverse the input string and return it.
		String reversed = "";
		for(int i = str.length() -1; i >= 0; i--){
			reversed = reversed + str.charAt(i);
		}
		System.out.println(reversed);
		return reversed;
	}

	static String shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		List<String> strList = Arrays.asList(messages);
		Collections.shuffle(strList);
		System.out.println(strList);
		return strList;
	}

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		return 4.0;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
			return 0.0;

		}
	}