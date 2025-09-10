import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int balance=hello.nextInt();
        if(balance>0){
            System.out.println("Positive Balance");
        }
        if(balance<0){
            System.out.println("Overdraft");
        }
        if(balance==0){
            System.out.println("Zero Balance");
        }
        else{
            System.out.println(" ");
        }
    }
}
