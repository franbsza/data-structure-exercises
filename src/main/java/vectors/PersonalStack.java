package vectors;

import base.StaticStructure;

public class PersonalStack<T> extends StaticStructure<T> {

    public PersonalStack(){
        super();
    }

    public PersonalStack(int capacity){
        super(capacity);
    }

    public void push(T item){
        super.add(item);
    }

    public boolean isEmpty(){
       return super.isEmpty();
    }

    public T peek(){
       return super.peek();
    }

    public T pop(){
        return super.pop();
    }
}
