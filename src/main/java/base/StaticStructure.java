package base;

public class StaticStructure<T> {

    protected T[] items;
    protected int size;

    public StaticStructure(int capacity){
        this.items = (T[])new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {}

    // add method more efficient
    protected boolean add(T item){

        if (size < items.length){
            items[size] = item;
            size++;
            return true;
        }
        else{
            System.out.println("space completely fulled");
            return false;
        }
    }

    //add in any position
    protected void add(T item , int index){

        if(index >= items.length){
            this.increaseCapacity();
        }

        if(items[index] == null){
            this.items[index] = item;
            size ++;
            return;
        }

        if(this.size < items.length) {
            for (int i = 0, j = 1; i < this.size; i++, j++) {

                if(items[index] == null){
                    this.items[index] = item;
                    break;
                }else{
                    this.items[size-i] = items[size-j];
                    this.items[size-j] = null;
                }
            }
        }
        size ++;
    }

    protected T peek() {
        if(this.isEmpty()){
            return null;
        }
        return items[size - 1];
    }

    protected T pop() {
        if(this.isEmpty()){
            return null;
        }
        T item = items[size - 1];
        items[size - 1] = null;
        size--;
        return item;
    }

    protected void increaseCapacity(){
    if(this.size == this.items.length){
        T[] newItems = (T[])new Object[this.items.length * 2];

        for (int i = 0; i < this.items.length ; i++){

            newItems[i] = this.items[i];
        }
        this.items = newItems;
    }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int getSize(){
        return this.size;
    }

    public String convertToString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0 ; i < this.getSize() -1 ; i++){
            s.append(items[i]);
            s.append(", ");
        }
        if(this.getSize() > 0){
            s.append(items[this.getSize() -1]);
        }
        s.append("]");
        return s.toString();
    }
}
