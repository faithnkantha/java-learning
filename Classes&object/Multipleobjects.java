package classes;
      
public class Multipleobjects {//main class
	    int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Createobject myObj = new Createobject();//create first object
       Multipleobjects myObj1 = new Multipleobjects();//create second object
       System.out.println(myObj.x);//print first object
       System.out.println(myObj1.x);//print second object
	}

}
 