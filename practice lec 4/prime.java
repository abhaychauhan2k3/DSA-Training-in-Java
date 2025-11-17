public class prime {
    // public static void main(String[] args) {
    //     int num = 17;
    //     int factor = 0;
    //     for (int i = 1; i <= num; i++) {
    //         if (num % i == 0) {
    //             factor++;
    //         }
    //     }
    // if(factor == 2){
    //     System.out.println("prime");
    // } else {
    //     System.out.println("not prime");
    // }
    // }

    //OPTIMIZED CODE
    public static void main(String[] args){
        int num = 2;
        for (int i = 2 ; i *i<= num ; i++){
            if(num % i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}

//to do leetcode que -> 204. Count Primes. 

