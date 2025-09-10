import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int a=hello.nextInt();              //User Inputs
        int b=hello.nextInt();
        int c=hello.nextInt();
        if(a>=b && a>=c){                    //Biggest Treasure
            System.out.println(""+a);
        }
        if(b>=a && b>=c){
            System.out.println(""+b);

        }
        if(c>=a && c>=b){
            System.out.println(""+c);
        }
        else{
            System.out.println(" ");
        }
    }
}
