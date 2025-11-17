public class CheckArmstrong {
    static int power(int num , int pow){
         if ( pow == 0 ){
            //time to prepare the result 
            return 1;
        }
        int smallResult = power(num , pow -1);
        int result = smallResult*num;
        return result;
    }
    static int countDigit(int num){
        if ( num == 0 )
        return 0;
        return 1+countDigit(num/10);
    }
    static boolean isArmstrong(int num , int org , int sum){
        if(num == 0){
            return sum == org ;
        }
        int total = countDigit(num);
        int lastDigit = num % 10;
        sum += power(lastDigit, total);
        return isArmstrong(num/10 , org , sum);
    }    
    static int countArmstrong(int range){
        if ( range == 0 ){
            return 0 ;
        }
        boolean res = isArmstrong(range, range, 0);
        int c = countArmstrong(range-1);
        if(res){
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(123));
        System.out.println(isArmstrong(123, 123, 0));
        System.out.println(countArmstrong(3));
    }
}
