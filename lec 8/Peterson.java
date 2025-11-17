public class peterson {
    static int fact(int num){
        if (num == 1 || num == 0){
            return 1;
        }
        return fact(num-1);
}
    // static int fpeterson(int num , int org){
        
    // }
    static void fpeterson(int num , int sum , int org){
        if (num == 0){
            if (sum == org){
                System.out.println("yes its a peterson");
            }
            else{
                System.out.println("its not a peterson");
            }
            return ; 
        }
        int lastDigit =  num % 10;
        sum = sum + fact(lastDigit);
        num = num/10;
        fpeterson(num , sum , org);
    }
     public static void main(String[] args) {
        fpeterson(145 , 0 , 145);
     }
}
