public class evenoddplacesSum {
    public static void main(String[] args) {
        int num = 15426;
        //i need sum of even and odd positions i.e evenSum = 2+5 = 7 (indexing starting from last and first index is 1 position)
        //1) Count number of digits ---> no need
        // int count =0 ;
        // while(num >0){
        //     count++;
        //     num/=10;
        // }
        // System.out.println("digitCounts = "+count);
        int oddSum = 0;
        int evenSum = 0;

        while(num>0){
            //get lastdigit and remove it 
            int lastDigit = num % 10;
            num = num/10;
            oddSum += lastDigit;
            if(num == 0){
                break;
            }
            int secondLastDigit = num%10;
            num = num /10;
            evenSum += secondLastDigit;
        }
        System.out.println("the sum of even positions is "+evenSum+" and the sum of odd positions is "+oddSum );

    }    
}
