public class rotateNum {
    public static void main(String[] args) {
        int num = 1235;
        int x = num;
        int newNum = -1;
        int rotation = 5;
        int count =0;
        while(x>0){
            count ++;
            x = x/10;
        }
        for (int i = 0 ; i <(rotation%count);i++){
            int lastDigit = num%10;
            int rem = num/10;
            int xNum = lastDigit*(int)Math.pow(10,count-1);
            newNum = xNum + rem;
            num = newNum;
        }
        System.out.println(newNum);
    }    
}
