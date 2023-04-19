package vectors;

public class Contact implements Comparable<Contact> {

    private int phone;
    private String type;
    private String name;
    private int priority;

    public Contact(int phone, String name, String type, int priority){
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.priority = priority;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone=" + phone +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact o) {

        if(this.getPriority() > o.getPriority()){
            return 1;
        }
        else if(this.getPriority() < o.getPriority()){
            return -1;
        }
        return 0;
    }
}
