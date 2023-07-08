public class Ifelsemethod{
  static void checkAge(int age){//created a method checkage and passedthe int parameter age
  //write the if statement
  if (age<18){
    System.out.println("you are underage,Please try again after few years!☹");
  }else{
    System.out.println("access granted,welcome😀");
  }
}
  public static void main(String[]args){
    checkAge(10);//called the checkage method and passed the arguemennt 30 as age
  
    //In Java, variables are only accessible inside the region they are created. This is called scope.

  //Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

  //A block of code refers to all of the code between curly braces {}.

 //Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared:
//A block of code may exist on its own or it can belong to an if, while or for statement. In the case of for statements, variables declared in the statement itself are also available inside the block's scope.

}
}
  
