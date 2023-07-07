public class Main {
  static void myMethod(String fname,int age){//create a method with parameters fname and age which act like like variables in methods
    //the commented area is to show how a method is called multiple times and printed
    // run the commented code separately to avoid errors.
    /*System.out.println("best java deveeloper around");//print output also a method
  }
  public static void main(String[]args){//calling the myMethod
    myMethod();//call  method many times
    myMethod();
    myMethod();
    myMethod();
    myMethod();*/
 System.out.println(fname + " kardashians"+ " is "+ age +" years old");}
  public static void main(String[]args) {
    myMethod("Kim",48);// alocate the values or arguements in a method
    myMethod("khloe",40);
    myMethod("kylie",35);
  //when working with multiple parameters the method call must have the same number of arguements as the parametersand passed in the same order.
 }
  
  
}
  