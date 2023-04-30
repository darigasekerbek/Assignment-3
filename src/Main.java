import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        MyArrayListStack<Integer> arr_stack = new MyArrayListStack<>();
        System.out.println("MyArrayListStack");
        arr_stack.push(111);
        arr_stack.push(222);
        arr_stack.push(333);
        System.out.println("Size of stack: "+ arr_stack.size());
        System.out.println("Top element of stack:" + arr_stack.peek());
        while(!arr_stack.isEmpty()){
            System.out.println(arr_stack.pop());
        }


        MyLinkedListStack<Integer> link_stack = new MyLinkedListStack<>();
        System.out.println("MyLinkedListStack");
        link_stack.push(101);
        link_stack.push(102);
        link_stack.push(103);
        System.out.println(link_stack.pop());
        System.out.println(link_stack.size());
        System.out.println(link_stack.isEmpty());

    }
}