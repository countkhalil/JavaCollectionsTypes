package week4Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * including ArrayLsit theres LinkedList & Vector
		 */
List<String> pickMe = new ArrayList<String>();
pickMe.add("Eenie");
//pickMe.add("Meenie");
pickMe.add("Minie");
pickMe.add("Minie");
pickMe.add("Moe");
pickMe.add(null);

for (String picks : pickMe) {
	System.out.println(picks);
}
System.out.println(pickMe.get(2));

	///This is a Set>>
/*
 * Includes HAshSet, LinkedHashSet, TreeSet>>
 */
Set<String> sing = new HashSet<String>();
sing.add("Do");
sing.add("Re");
//Will only put (1) Re since duplicates not allowed
sing.add("Re");
sing.add("Me");
sing.add("Fa");
if (sing.contains("Fa")) {
		sing.remove("Me");
	}
	for (String song: sing) {
		System.out.println(song);
	// Will probably print out of order
	}
	
// This is a Map-- Includes: HashMap, LinkedHashMap, TreeMap, Hashtable >>>
	/*
	 * 1st value= Key, 2nd Value is Value 
	 * Dictionary Ex: Word=Key; Definition=Value
	 */
	Map <Integer, String> racePlacements = new HashMap <Integer, String>();
racePlacements.put(1, "Tyreke");
racePlacements.put(2, "Lee");
racePlacements.put(3, "Timmy");
racePlacements.put(4, "Diego");

System.out.println(racePlacements.get(1));

Set<Integer> racerKeys = racePlacements.keySet();
for (Integer key: racerKeys) {
	System.out.println(key + " : " + racePlacements.get(key));
}
 
Map<String,String> dictionary = new HashMap<String, String>();
dictionary.put("zebastian", "A Great Looking Man");
dictionary.put("Taylor", "A Bum");

//Repeat String >>

String tripleHi= multiplyString("Hi", 3);
System.out.println(tripleHi);

//StringBuilder Ex
String firstName= "Dill";
String lastName= " Finster";
StringBuilder fullName = new StringBuilder("Lenny");
fullName.append (lastName);
System.out.println(fullName.toString());
	}

public static String multiplyString (String str, int num) {
StringBuilder result = new StringBuilder();
for (int i =0; i < num; i++) {
	result.append(str);
}
return result.toString();
		}



}
