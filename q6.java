import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int marks=hello.nextInt();
        if(marks>=90){
            System.out.println("A");
        }
        if(marks>=75&&marks<90){
            System.out.println("B");
        }
        if(marks>=50&&marks<75){
            System.out.println("C");
        }
        if(marks<50){
            System.out.println("Fail");
        }
        else{
            System.out.println(" ");
        }
    }
}
