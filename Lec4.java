//Taking input

import java.util.Scanner;

public class Lec4 {
    public static void main(String args[]) throws Exception {
    //    //1. Commaand line Inputs
    //    String name = args[0];
    //    int age = Integer.parseInt(args[1]);
       
       

       //method 2
       Scanner sc = new Scanner("how are you");//Scanner is a buffer , sc is a reference variable
       int wordcount = 0;
       while(sc.hasNext()){ //to count the number of lines we will use hasNextLine()
        wordcount++;
        System.out.println(sc.next());
       };
        System.out.println("Number of words: " + wordcount);
       sc.close();
    
       //we can use nextInt(), nextLine().
       //kisi bhi next wale method ke baad agr nextLine() liya toh wo input nhi lega because nextLine terminates when we press enter 
       //so use one more nextLine after nextInt() or other next methods before using nextLine()

       //nextLine tereminats on enter key and other next methods terminate on space
    }
}
//clean code

//once scanner is closed it cannot be reopened .
