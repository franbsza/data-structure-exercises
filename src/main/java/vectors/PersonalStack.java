package vectors;

import vectors.base.StaticStructure;

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

    public T peek() {
        if(this.isEmpty()){
            return null;
        }
        return items[size - 1];
    }

    public T pop(){
        return super.pop();
    }
}
