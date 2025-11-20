public class SearchAndreplace {
    static String searchAndReplace(String str , char search , char replace){
        //base case 
        if (str.length() == 0 ){
            return "";
        }

        //recursive call
        String result = searchAndReplace(str.substring(1), search, replace);

        //pop logic 
        if (str.charAt(0)==search){
            return replace + result;
        }
        else{
            return str.charAt(0) + result;
        }

    }
    public static void main(String[] args) {
        String result = searchAndReplace("hello", 'l', 'x');
        System.out.println(result);
    }
}
