package week3Arrays;

public class ArrayExamples {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int x = 200;
	 {if (x >300) {
		 System.out.println("Outcome 1");
	 } else {
		 System.out.println("Outcome 2"); }

		 for (int i = 0; i <= 10; i += 1) {
			 System.out.println( i);
		 }
		 int haha = 8;
	 do {
		System.out.println(haha); 
		haha ++;
	 }while (haha < 10) ;
	  
	 int mine = 20;
	 while (mine < 22) {
		 System.out.println(mine);
		 mine ++;
	 }
		 
	 
	 String[] students = new String[3];
	 students[0]= "Mimi";
	 students[1]= "Lenny";	
	 students[2]= "Kelly";
	 
	 for (int i=0; i < students.length; i++) {
		 System.out.println(students[i]);
	 }
	 
	 /// Enhanced For Loop ----- " : " means "in"
	 
	 for (String student : students ) {
		 System.out.println(student);
	 }
	 int[] multiplesOf3 = new int [10];
	 for (int i = 1; i <= multiplesOf3.length; i++) {
		 multiplesOf3[i-1] = i * 3;
		 System.out.println("Number: " + multiplesOf3[i-1]);
	 }
	 
	 int[] multiplesOf5 = new int [10];
	for (int i=0; i < multiplesOf5.length; i++) {
		 multiplesOf5[i] = (i+1) * 5;
		 System.out.println(multiplesOf5[i]);
	 }
	 
	 String firstName = "Testing";
			 String lastName = "1,2";
			 String fullName = createFullName(firstName, lastName);
	System.out.println(fullName);

	char tryThis = 'h';
	char flyThis = 'h';
	System.out.println(tryThis == flyThis);

			 //// END BRACKETS >>
	 }}
		
	public static String createFullName (String x, String y) {
		String fullName= x + " " + y;
		return fullName;
		/// Can also "return x + " " + y;" 
	}


	}


		


