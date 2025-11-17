
public class swap_positionNumber {
    public static void main(String[] args) {
       int num = 1245;
       int sum = 0;
       int position = 0;
       
       while(num>0){
       position ++;
       int lastdigit = num % 10;
       sum = sum +position*(int)Math.pow(10,lastdigit-1);
       num = num/10;
    }
    System.out.println(sum);
   }
}

/*que - without array, string, recursion.
num = 72456
swap first and last digit.
*/