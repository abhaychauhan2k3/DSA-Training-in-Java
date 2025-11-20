public class ReverseString {
    // static twoPointer(char arr[], int left , int right){
    //     if(left > right){
    //         return new String(arr);
    //     }
    // }
    // static String reverseApproach2(String str){
    //     return twoPointer(str.toCharArray(),0,str.length()-1);
    // }

    static String reverse (String str){
        //base case 
        if(str.length() == 0){
            return "";
        }
        //recursive call
        String oldResult = reverse(str.substring(1));
        String newResult = oldResult + str.charAt(0);
        return newResult;
    }
    public static void main(String[] args) {
        String str = "Abhay";
        System.out.println(reverse (str));
    }
}