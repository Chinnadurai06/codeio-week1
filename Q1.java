import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
       Scanner hello=new Scanner(System.in);
       int n=hello.nextInt();
       if(n%2==0){
           System.out.println("ON");
       }
       else{
           System.out.println("OF");
       }
    }
}
