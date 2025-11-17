public class printdigit {
    public static void main(String[] args) {
        // int num = 12345;
        // //reverse it first 
        // int rev = 0;
        // while(num != 0){
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num / 10;
        // }

        // //now
        // while (rev != 0 ){
        //     int digit = rev % 10;
        //     System.out.println(digit);
        //     rev = rev / 10;
        // }

        int num = 22514;
        int x = num ; 
        //counts digit 
        int count = 0;
        while  (num != 0 ){
            // int c = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);

        while (x != 0){
            int y = x/(int)(Math.pow(10,count-1));
            System.out.println(y);
            x = x % (int)(Math.pow(10,count-1));
            count --;
        }
    }
}
