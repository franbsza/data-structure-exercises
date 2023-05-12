package vectors;

import vectors.base.StaticStructure;

public class PersonalList<T> extends StaticStructure<T> {

    public PersonalList(){
        super();
    }

    public PersonalList(int capacity){
        super(capacity);
    }

    public boolean push(T item){
        return super.add(item);
    }

    public void push(T item , int index){
        super.add(item, index);
    }

    public T pop(){
        return super.pop();
    }
}
