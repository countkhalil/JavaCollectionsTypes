// code by Khalil M.
package week4Assignments;
import java.util.*;
public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ages =new int [8];

ages[0] = 3;
ages[1] = 9;
ages[2] = 23;
ages[3] = 64;
ages[4] = 2;
ages[5] = 8;
ages[6] = 28;
ages[7] = 93;


//Below i used the length() method in order to find the last index in the array. Use -1 since the Array uses a 0 index
System.out.println(ages[ages.length-1]- ages[0]);

int [] ages2 = new int [9];

for (int i=0; i < ages2.length; i++) {
	 ages2 [i] = (i*i);
	// System.out.println(ages2[i]);
}
	
// Same as above
System.out.println(ages2[ages2.length-1]- ages2[0]);
int sum = 0 ;

		for (int i =0; i<ages2.length ; i++) {
			 sum += ages2[i];
		}
		// Added all the numbers together above using a for loop then took that sum and divided it by total elements of Array. 
		
		//System.out.println("sum: " + sum);
		// Should've used double
		int avg = sum / ages2.length ;
		System.out.println("Average of the Array is: " + avg);
	
		String[] names = new String [6];
		names[0]= "Sam";
		names[1]= "Tommy";
		names[2]= "Tim";
		names[3]= "Sally";
		names[4]= "Buck";
		names[5]= "Bob";
		
		sum=0;
		for (int i= 0; i <names.length; i++) {
			sum+= names[i].length();
		}
		avg = sum/ names.length;
		System.out.println("Average length of the names is: " + avg);
		
		// Use A StringBuilder to concatenate all the names
		StringBuilder allNames = new StringBuilder("");
		for (int i =0; i < names.length; i++) {
			allNames.append(names [i] + " ");
		}
		System.out.println("The names combined is: " + allNames.toString());
		
// QUESTION 3: Array [Array.length-1] is used to access the last element 
// QUESTION 4: The first element is Array[0] since Arrays are 0 indexed
	
	//Loop similar to above ones. Used length() to get the values for each	
		int[] nameLengths = new int[6];
		 for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			 System.out.println("Length: " + nameLengths[i]);
		 }	
//Copy & Pasted loop from earlier and changed the variables 
		 sum = 0 ;

			for (int i =0; i<nameLengths.length ; i++) {
				 sum += nameLengths[i];
			}
			System.out.println(sum);
			
			
	//Called the method i created for repeating a word below and input the necessary arguments
			String repeat = repeatWord("Hello", 4);
			System.out.println(repeat);
	
			
	//Called the method i created for getting a fullName below and input the necessary arguments
			String firstName= "Zeb";
			String lastName = "Chuckster";
			String yourName = fullName(firstName, lastName);
			System.out.println(yourName);
			
	//Tested out the method for seeing if the sum of an Array is greater than 100
	boolean greaterThan = oneHundred(nameLengths );
	System.out.println (greaterThan);
	
	//Tested out the method for an Array Average 
	double []newArray= new double[3];
	newArray[0]= 2;
	newArray[1]= 3;
	newArray[2]= 4; 
	double average = arrayAvg(newArray);
	System.out.println(average);
	
	//Tested out comparing averages of 2 arrays
	double []newArray2= new double[3];
	newArray2[0]= 3;
	newArray2[1]= 4;
	newArray2[2]= 5; 
	double average2 = arrayAvg(newArray2);
	System.out.println(average2);
	System.out.println(avgCompare(newArray, newArray2));
	
	//Tested out if a drink will be bought
	double pocketMoney = 12.50;
	boolean isHotOutside = true ;
	System.out.println(willBuyDrink(isHotOutside, pocketMoney));
	 
	//Tested my method of whether a movie has been seen
	List <String> movieList = new ArrayList<String>();
	
	movieList.add("Jaws");
	movieList.add("Pulp Fiction");
	movieList.add("Friday the 13th");
	
	String haveI = iveSeenIt(movieList);
	System.out.println(haveI);
	
	
	
	}
	
			
	
	
	
	// Created new method repeatWord that can be called
	public static String repeatWord (String word, int n) {
				StringBuilder result = new StringBuilder();
				for (int i =0; i < n; i++) {
					result.append(word);
				}
				return result.toString();
						}
	//Created new method fullName that can be called 
	public static String fullName (String firstName, String lastName) {
		StringBuilder result = new StringBuilder();
		String fullName= firstName + " " + lastName;
		return fullName.toString();
				}		 
	//Created new method oneHundred that can be called 
	public static boolean oneHundred (int[] numbers ) {
		int sum= 0;
		for (int number: numbers) {
			sum+= number;
		} 
		return sum > 100 ;
	}
//Created new method arrayAvg that can be called
	public static double arrayAvg (double[] numbers ) {
		double sum= 0;
		for (double number: numbers) {
			sum+= number;
		} 
		return sum / numbers.length;
	}
	//Created new method avgCompare that can be called
		public static boolean avgCompare (double[] array1, double[] array2  ) {
			double avg1 = arrayAvg(array1);
			double avg2 = arrayAvg(array2);
		return (avg1 > avg2);
		}
		//Created new method willBuyDrink that can be called
				public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket  ) {
					return isHotOutside && (moneyInPocket >10.50); 
				}
		//Created new method iveSeenIt that can be called
				
				public static String iveSeenIt (List<String> movies  ) {
					movies.replaceAll(movie -> movie.toUpperCase());
			
					Scanner sc= new Scanner(System.in);
					System.out.print("Movie Name: ");
					String movieName = sc.nextLine().toUpperCase();
					
					String result = " ";
				if (movies.contains(movieName) ) {
						 result= "Already Seen It!";
					}else {
						result= "Time to Waste Another 2 Hours of Your Life";
					}return result  ;
				}
		 
		 
}
