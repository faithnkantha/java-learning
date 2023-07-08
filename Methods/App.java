public class App {//main class
    static int myMethod(int x,int y){//pass two parameters x and y
     return x + y +10;//must return a value because method is not void
    }
    public static void main(String[] args) throws Exception {
        int z=myMethod(10,17);
        System.out.println(myMethod(10,17));//arguments/values of the parameters must be passed in the same order 
        System.out.println(z); //storing the results in a variable is easier to read and maintain
    }
}
