import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int a=hello.nextInt();    //user inputs
        int b=hello.nextInt();
        int op=hello.nextInt();
        if(op==1){
            System.out.println(a+b); //Addition
        }
        if(op==2){
            System.out.println(a-b);  //sub
        }
        if(op==3){
            System.out.println(a*b);  //mul
        }
        if(op==4){
            System.out.println(a/b); //div
        }
        else{
            System.out.println("");
        }
    }
}
