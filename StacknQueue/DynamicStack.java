package StacknQueue;

public class DynamicStack extends CustumStack {
    public DynamicStack() {
        super();// it will call customStack
    }

    public DynamicStack(int size) {
        super();// it will call customStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        //insert item
        return super.push(item);
    }

}
