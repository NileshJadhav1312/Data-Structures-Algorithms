import java.util.*;

class StockSpanner {
    // Stack to store price and span
    private Stack<AbstractMap.SimpleEntry<Integer, Integer>> st; //stack of hashmap

    public StockSpanner() // creating new stack 
    {
        st = new Stack<>();
    }

    public int next(int price) 
    {
        int span = 1;  // firstly we have span 1 for each element

        // Pop smaller or equal prices and add their spans
        while (!st.isEmpty() && st.peek().getKey() <= price)  // if stack top has less value then add its span to the cirrent elements pan
         {
            span += st.pop().getValue();
        }

        // Push current price and its span
        st.push(new AbstractMap.SimpleEntry<>(price, span));

        return span;
    }
}