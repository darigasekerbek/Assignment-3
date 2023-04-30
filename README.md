# Assignment-3
MyArrayListQueue is a generic class that uses the ArrayList data structure 
to implement a queue.It offers ways to add and remove elements from a queue,
look at the element at the head of the queue,determine if the queue is empty, 
and find out how big the queue is.
Methods:
Public void enqueue(T item).
With this method, an element is added to the end of the queue.
Public T dequeue() This function takes the first element in the queue from the queue and returns it. A NoSuchElementException is thrown if the queue is empty.
public T peek()
Without removing it, this function returns the first element in the queue. A NoSuchElementException is thrown if the queue is empty.
isEmpty() is a public boolean.
This method determines if the queue is empty. If the queue is empty, true is returned; if not, it returns false.
public int() size
This procedure returns the size of the queue.


MyArrayListStack is a generic class that implements a structure 
using the ArrayList data structure. It provides methods to add 
and remove elements from the stack, look at the element at 
the top of the stack, check, empty the stack,
get the size of the stack.
public void push(T item)
This method adds an element to the top of the stack.
public T pop ()
This method removes and returns the element at the top of the stack. If the stack is empty, an EmptyStackException is thrown.
public peek()
This method returns the element at the top of the stack without removing it. If the stack is empty, an EmptyStackException is thrown.
public boolean isEmpty()
This method checks if the stack is empty or not. Returns true if the stack is empty, false otherwise.
public size()
This method returns the number of elements on the stack.
