public class GST {
    // static int[] getPricesWithGST(int prices[] , int index){
    //     //GST = 18%
    //     int newGSTPrices[] = new int[prices.length];
    //     for(int i=0 ; i<prices.length;i++){
    //     newGSTPrices[i] = (int) (prices[i] + prices[i]*0.18);
    //     }
    //     return newGSTPrices;
    // }

    //by recursion
    static int[] getPricesWithGST(int prices[],int index){
        if (index == prices.length){
            int gst[] = new int[prices.length];
            return gst;
        }
        int gst[] = getPricesWithGST(prices, index+1);
        gst[index] = prices[index] + (int)(prices[index] * 0.18);
        return gst;
    }
    public static void main(String[] args) {
        int prices[] = {100,200,430,900};
        int newPrices [] = getPricesWithGST(prices , 0);
        for(int p : newPrices){
            System.out.println(p);
        }
    }    
}
