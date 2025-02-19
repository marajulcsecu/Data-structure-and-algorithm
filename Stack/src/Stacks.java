import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("soreful");
        stack.push("sharifa");
        stack.push("merajul");
        stack.push("hafsa");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search("hafsa"));
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
