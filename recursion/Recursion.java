package recursion;

public class Recursion {//main class

	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
    int result=sum(10);//initialize variable result with value 10
    System.out.println(result);//print result
	}
public static int sum(int k) {//calling the method
	if(k>0) {//if statement
		return k+sum(k-1);
	}else {
		return 0;
	}
}
}
