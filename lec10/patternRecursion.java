public class patternRecursion {
    static void printStar(int numberOfStars){
        if(numberOfStars== 0){
            return ;
        }
        System.out.print("*");
        printStar(numberOfStars - 1);
    }
    static void printLine(int numberOfRows){
        if(numberOfRows == 0){
            return ;
        }
        printLine(numberOfRows-1);
        printStar(numberOfRows);
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(6);
    }
}
