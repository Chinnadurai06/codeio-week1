import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int year=hello.nextInt();
        boolean years;
        years=(year%4==0&&year%100!=0||year%400==0);
        if(years){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}
