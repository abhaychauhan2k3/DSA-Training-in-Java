//question: find largest of 3 numbers using nested if else without using any logical operators
import java.util.*;
public class Lec4_1 {
    public static void main(String args[]) throws Exception {
        //if else12
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st num:");
        int a = sc.nextInt();
        System.out.println("Enter a 2nd num:");
        int b = sc.nextInt();
        System.out.println("Enter the third num:");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }

        
        sc.close();
    }
    
}
