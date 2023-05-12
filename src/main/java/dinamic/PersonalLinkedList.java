package dinamic;

public class PersonalLinkedList<T> {

    Node<T> init;
    Node<T> last;
    int size = 0;

    class Node<T> {

        T item;
        Node<T> prox;

        public Node(T item) {
            this.item = item;
            this.prox = null;
        }

        public T getItem() {
            return item;
        }

        public Node<T> getProx() {
            return prox;
        }

        public void setProx(Node<T> prox) {
            this.prox = prox;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", prox=" + prox +
                    '}';
        }
    }

    public void add(T item){
        Node<T> node = new Node<>(item);
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
