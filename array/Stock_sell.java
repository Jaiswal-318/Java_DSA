
public class Stock_sell {
    public static void main(String... args){
        int Day_prices[] ={6,7,4,8,2,1};
        int n = Day_prices.length;
        int max_profit = 0;
        int s =0;      // b=0;
        int buy_price = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++ ){
            if(buy_price < Day_prices[i]){ 
                int profit = Day_prices[i] - buy_price;
                if(max_profit < profit){
                    s=i;
                    max_profit = Math.max(max_profit, profit);}
            } else{
            //    if(b<a){
            //     b=i;   // unable to calculate buy day   
            //    }
                buy_price = Day_prices[i];  }} 
                System.out.println("The stock should buy on day ..."+" and sell on day "+(s+1)+" to get max profit of "+max_profit);
                    
    }
}
