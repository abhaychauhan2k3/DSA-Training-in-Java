public class switchCase {
    public static void main(String[] args) {
        //switch with expression
        int price = switch(1){ //no break needed
            //case 1 -> 100;
            case 1 -> {
                int x = 10 ;
                yield (100+x);
            }
            case 2 -> 200;
            //case 2,3 ->300; 
            default-> 0;
        };
        System.out.println(price);

        //column syntax
        //can pass strings , enums.

    }
}
