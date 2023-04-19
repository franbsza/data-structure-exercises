package vectors;

public class PersonalPriorityQueue<T> extends PersonalQueue<T> {

    @Override
    public void enqueue(T item){
        Comparable<T> key = (Comparable<T>) item;
        int i ;

        for(i = 0; i< this.getSize(); i++){
            if(key.compareTo(this.items[i]) < 0){
                break;
            }
        }
        this.add(item, i);
    }
}
