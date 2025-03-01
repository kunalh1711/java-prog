package StacknQueue;

public class CustumStack {
    // public int size;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    

    // public CustumStack(int size) {
    //     this.size = size;
    // }

    int ptr = -1;

    public CustumStack(){
        this(DEFAULT_SIZE);
    }


    public CustumStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("stack is full!!!!!!!!!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");

        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");

        }
        return data[ptr];
        
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
