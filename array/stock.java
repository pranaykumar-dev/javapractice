package array;

public class stock {
    public static int buystock(int profit[]){
        int buyProfit=Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=1;i<profit.length;i++){
            if(buyProfit<profit[i]){
                int profits = profit[i] - buyProfit;
                maxprofit=Math.max(maxprofit,profits);
            }else{
                buyProfit=profit[i];
            }
        }return maxprofit;

    }public static void main(String[] args) {
        int profit[]={3,4,5};
        System.out.println(buystock(profit));
    } 
    
}
