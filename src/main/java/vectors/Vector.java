package vectors;

public class Vector {

    private String[] items;

    public Vector(int capacity){
        this.items = new String[capacity];
    }

    public void add(String item){
        for(int i=0; i < items.length; i++){
            if(items[i] == null){
                items[i] = item;
                System.out.println("Done!");
                break;
            }
        }
    }
}
