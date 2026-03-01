import java.util.Stack;

class GfG {

    Stack<Integer> minstack = new Stack<>();
    // Push element
    public void push(int a, Stack<Integer> s)
    {
        s.push(a);
        // If minstack is empty OR new element is smaller/equal
        if (minstack.isEmpty() || a <= minstack.peek())
        {
            minstack.push(a);
        }
    }

    // Pop element
    public int pop(Stack<Integer> s)
    {
        if (s.isEmpty())
        {
            return -1;
        }

        int removed = s.pop();

        // If removed element is current minimum
        if (!minstack.isEmpty() && removed == minstack.peek()) 
        {
            minstack.pop();
        }

        return removed;
    }

    // Return minimum element
    public int min(Stack<Integer> s)
    {
        if (minstack.isEmpty()) 
        {
            return -1;
        }

        return minstack.peek();   // DO NOT pop here
    }

    public boolean isFull(Stack<Integer> s, int n) {
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        return s.isEmpty();
    }
}