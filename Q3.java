import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int time1=hello.nextInt();
        int time2=hello.nextInt();
        if(time1<time2){
            System.out.println("Arjun");
        }
        if(time1>time2){
            System.out.println("Varun");
        }
        if(time1==time2){
            System.out.println("Tie");
        }
        else{
            System.out.println(" ");
        }
    }
}
