package vectors;

import vectors.base.StaticStructure;

public class PersonalQueue<T> extends StaticStructure<T> {

    public PersonalQueue(){
        super();
    }

    public PersonalQueue(int capacity){
        super(capacity);
    }

    public void enqueue(T item){
        super.add(item);
    }

    public T dequeue(){
        if(!this.isEmpty()){
            T item = this.items[0];
            super.remove(0);
            return item;
        }
        return null;
    }

    //return the head of this queue
    public T peep(){
        if(!this.isEmpty()){
            return this.items[0];
        }
        return null;
    }
}
