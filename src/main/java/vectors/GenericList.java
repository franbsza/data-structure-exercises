package vectors;

import java.lang.reflect.Array;

public class GenericList<T> {

    private T[] items;
    private int size;

    public GenericList(int capacity){
        this.items = (T[])new Object[capacity];
        this.size = 0;
    }

    public GenericList(int capacity, Class<T> classType){
        this.items = (T[]) Array.newInstance(classType, capacity);
        this.size = 0;
    }

    public GenericList() {
        this.items = (T[])new Object[10];
    }

    //method not recommended
    public void addOld(T item){
        for(int i=0; i < items.length; i++){
            if(items[i] == null){
                items[i] = item;
                System.out.println("Done!");
                break;
            }
        }
    }

    // add method more efficient
    public boolean add(T item){
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
    public void add(T item , int index){

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

    public T search(int index){
        if(index >= 0 && index < size){
            return items[index];
        }
        else{
            throw new IllegalArgumentException("Invalid index.");
        }
    }


    public boolean search(T item){
        for(int i=0 ; i < items.length -1 ; i++){
            if(item.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    public int searchIndex(T item){
        for(int i=0 ; i < items.length -1 ; i++){
            if(item.equals(items[i])) {
                return i;
            }
        }
        return -1;
    }

    public void increaseCapacity(){
        if(this.size == this.items.length){
            T[] newItems = (T[])new Object[this.items.length * 2];

            for (int i = 0; i < this.items.length ; i++){

                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
    }
}
