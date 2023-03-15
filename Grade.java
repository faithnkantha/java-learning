package grade_test;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int marks = 56;
       if (marks>=0 && marks<=30){
    	   System.out.println("fail");}
       else if (marks>=30 && marks<=39) {
    	   System.out.println("grade E");}
       else if (marks>=40 && marks<=59) {
    	   System.out.println("grade D");}
       else if (marks>=60 && marks<=69) {
    	   System.out.println("grade C");}
       else if (marks>=70 && marks<=79) {
    	   System.out.println("grade B");}
       else if (marks>=80 && marks<=89) {
    	   System.out.println("grade B+");}
       else if (marks>=90 && marks<=100) {
    	   System.out.println("grade A");}
       else {
    	   System.out.println("invalid");}
       if (marks<0) {
    	   System.out.println("negative");}
       else if (marks>0) {
    	   System.out.println("positive");}
       else { 
    	   System.out.println("0");}
       while (marks <= 100) {
    	   System.out.println("marks");
    	   ++marks ;}
       }
       }
       
       
    	  
	


