package haltcondition;

public class Haltcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int result=sum(5,10);//values of variable sum
      System.out.println(result);//print result
	}
  public static int sum(int start,int end) {//call method sum with parameters start and end
	  if(end>start) {// if statement
	  return end +sum(start,end-1);
	  }else {
		  return end;//halting condition
	  }
  }
}
