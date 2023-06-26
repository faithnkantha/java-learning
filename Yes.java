package fuckit;

public class Yes {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement
		if (20>18)
     System.out.println("20 is greater than 18...");
		//else statement
		int time=12;// Initialize the variable time and add value 12
		if(time<18) { //if statement
			System.out.print("good day");
		}else//condition
			System.out.println("good evening");
		//if else if statement
		int timed = 22;
		if(timed < 10) {
			System.out.println("good morning");
		}else if (timed<18){
			System.out.println("good day");
			
		}else {
			System.out.println("good evening");
		}
		//shorthand
		int timetm=20;
		String result =(timetm < 18)?"goodday" :"goodevening";
		System.out.println(result);
		//switch
		int day = 1;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;//if a match is found it ignores rest of code
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    
	}
		//switch with default keyword
		int dy = 1;
		switch (dy) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default://it specifies a code to be executed if no case match
		    System.out.println("Looking forward to the Weekend");
		    
		}
		//while loop-loop through a block of code if condition is true.
		int i = 0;
		while (i <5) {
		  System.out.println(i);
		  i++;
		}
		//do while loop
		int m = 5;
		do {
		  System.out.println(m);
		  m++;
		}
		while (i < 10);
		//for loop
		for (int h = 0; h <= 100; h = h + 2) {
			  System.out.println(h);
			}
		//for each loop-used to loop through elements.
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String w : cars) {
		  System.out.println(w);
		}
		//break can be used to jump out of a loop
		for (int y = 0; y < 10; y++) {
			  if (y == 4) {
			    break;
			  }
			  System.out.println(y);
			}
		//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
		for (int z = 0; i < 10; z++) {
			  if (z == 4) {
			    continue;
			  }
			  System.out.println(z);
			}
		//break and continue can also be used in while loop
	}
}
