import java.util.Stack;

public class Stacks{
    public static void main(String[] args) {
        //stack = LIFO data structure. Last-In First-Out
        //        stores objects into a sort of "vertical tower"
        //        push() to add to the top 
        //        pop() to remove

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());
        stack.push("Raptors");
        stack.push("Heat");
        stack.push("Lakers");
        stack.push("Rockets");


        System.out.println(stack);

        String top = stack.pop();
        System.out.println(top);
        
        //to get top of stack without popping
        System.out.println("Top off stack: " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Raptors"));
        
    }
}