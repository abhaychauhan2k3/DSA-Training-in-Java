public class practice {
    static int sumOfDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int sum = 0;
        if (num == 0) {
            return sum;
        }
        int res = sumOfDigit(num / 10);
        int lastDigit = num % 10;
        int result = res + lastDigit;
        return result;
    }

    static void sumOfDigit(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        int lastDigit = num % 10;
        num = num / 10;
        sumOfDigit(num, sum + lastDigit);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
        sumOfDigit(123, 0);
    }
}
// REMEMBER RETURN TYPE AGR OTHER THEN VOID HOGA THEN JO RESULT GENERATE HOGA WO POP TIME PR HOGA, AND IF RETURN TYPE VOID HOGA THEN RESULT GENERATE PUSH TIME PR HOGA
