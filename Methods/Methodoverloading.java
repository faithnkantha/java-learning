public class Methodoverloading {//main class
  static int addMethod (int x,int y){//create a method to pass integer x and y
    return x + y;
  }
  static double addMetthod(double x,double y){//create a method to pass double x and y
    return x+y;
  }
  public static void main(String[]args){
    int myNum1=addMethod(20, 90);//pass the arguements for int x and y
    double mynum2=addMetthod(8.67,7.45);//pass arguements for double x and y
    System.out.println("int: "+ myNum1);
    System.out.println("double: "+ mynum2);
    // multiple methods can have the same name as long as the number and/or type  of parameters are different
  }
    
  }

