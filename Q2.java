import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int balance=hello.nextInt();              //User input
        if(balance>0){                              // Balance high
            System.out.println("Positive Balance");
        }
        if(balance<0){                                //Balance Minus
            System.out.println("Overdraft");
        }
        if(balance==0){                               // Balance Was Zero
            System.out.println("Zero Balance");
        }
        else{
            System.out.println(" ");
        }
    }
}
