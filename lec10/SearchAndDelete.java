public class SearchAndDelete{
    static String searchAndDelete(String str , char search ){
        //base case 
        if (str.length() == 0 ){
            return "";
        }

        //recursive call
        String result = searchAndDelete(str.substring(1), search);

        //pop logic 
        if (str.charAt(0)==search){
            return result;
        }
        else{
            return str.charAt(0) + result;
        }

    }
    public static void main(String[] args) {
        String result = searchAndDelete("hello", 'l');
        System.out.println(result);
    }
}
