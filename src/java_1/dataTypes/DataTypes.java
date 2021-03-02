package java_1.dataTypes;

class DataTypes {

//		int number = 2021;
//		int yearOfBirth = 1977;
//		Array nums = [3,4,5,6,7,8,10,12];
//		String movieName = "Meet The Parents";
//		char male = 'm';
//		long triplet = 3L;
//		char female = 'f';
//		byte decimalVal = .0000000000001f;
//		int halfByte = 0101;


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs
		yearsToMonths(2);
		monthsToHours(8);
		daysToSeconds(730);
		canDrive(4);
		centuriesToSeconds(1L);
	}

	static void yearsToMonths(Integer years) {
		System.out.println("yearsToMonths() Method: ");
		System.out.println(years * 12);

	}

	static void monthsToHours(Integer months) {
		System.out.println("monthsToHours() Method: ");
		System.out.println(months * 730);
	}

	static void daysToSeconds(Integer days) {
		System.out.println("daysToSeconds() Method: ");
		System.out.println(days * 86400);
	}

	static void centuriesToSeconds(Long centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds
		System.out.println("centuriesToSeconds() Method: ");
		Double seconds = 3.1556952;
		Long secMultiplier = 1000000000L;
		Double multiplySeconds = seconds * secMultiplier;
		System.out.println(centuries * multiplySeconds);
	}

	void dollarsToBitcoin(Object dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars  3.1556952 x 10^9 Seconds
	}

	static void canDrive(Integer age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		System.out.println("canDrive() Method: ");
		if(age >= 16){
			System.out.println("Able to drive, after passing a drivers test...");
		}
		else{
			System.out.println("Not old enough to take the drivers test...");
		}
	}

	String[] getDataTypes(int num1, boolean bool1, long long1) {
//		Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.
		return new String[]{null,null,null};
	}

}