import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private ArrayList<T> arr_list;
    public MyArrayListStack(){ // constructor that init MyArrayListStack
        arr_list = new ArrayList<>();
    }
    //  add an item on the top of stack
    public void push (T item){
        arr_list.add(item);
    }
    //remove and return item on the top of stack
    public T pop(){
        if(arr_list.isEmpty()){
            throw new EmptyStackException();
        }
        return arr_list.remove(arr_list.size()-1);
    }
    // return item on the top without removing
    public T peek(){
        if(arr_list.isEmpty()){
            throw new EmptyStackException();
        }
        return arr_list.get(arr_list.size()-1);
    }
    // return true if stack is empty, false if not
   public boolean isEmpty(){
        return arr_list.isEmpty();
   }
   //return num of item in stack
   public int size(){
        return arr_list.size();
   }
}
