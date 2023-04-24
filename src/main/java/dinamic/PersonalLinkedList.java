package dinamic;

public class PersonalLinkedList<T> {

    Node<T> init;
    Node<T> last;
    int size = 0;

    public void add(T item){
        Node<T> node = new Node<T>(item);
        if(this.size == 0){
            this.init = node;
        }
        else{
            this.last.setProx(node);
        }
        this.last = node;
        size++;
    }

    public String print(){

        if(this.size == 0){
            return "[]";
        }


        StringBuilder s = new StringBuilder();
        s.append("[");
        Node<T> current = this.init;
        s.append(current.getItem()).append(",");

        while (current.getProx() != null){

            current = current.getProx();
            s.append(current.getItem()).append(",");
        }
        s.append("]");
       return s.toString();
    }
}
