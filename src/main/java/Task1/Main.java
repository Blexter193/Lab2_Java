package Task1;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Elements of the stack: ");

        for (Integer item : stack) {
            System.out.println(item);
        }
    }

}
