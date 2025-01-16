package concept.stack;

import java.util.Stack;

public class StockSpan {
    public static void stocksSpan(int[] stocks, int[] span) {
        Stack<Integer> stk = new Stack<>();
        span[0] = 1;
        stk.push(0);
      for (int i = 1; i<stocks.length; i++){
          int currStocks = stocks[i];
          while(!stk.empty() && currStocks > stocks[stk.peek()]){
              stk.pop();
          }
          if(stk.empty()){
              span[i] = i+1;
          }else {
              span[i] = i-stk.peek();
          }
          stk.push(i);
      }
    }
        public static void main (String[]args){
            int[] stocks = {100, 80, 60, 70, 60, 85, 100};
            int[] span = new int[stocks.length];
            stocksSpan(stocks,span);
            for(int i:span){
                System.out.println(i);
            }

        }
    }

