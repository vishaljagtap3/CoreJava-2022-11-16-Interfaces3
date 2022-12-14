public class Message implements Comparable{
    private int id;
    private String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public int compare(Object obj) {
        Message message = (Message) obj;
        if( this.id > message.id) {
            return 1;
        }
        if( this.id < message.id) {
            return -1;
        }
        return 0;
    }
}

class MessageComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Message m1 = (Message) obj1;
        Message m2 = (Message) obj2;

        if(m1.getText().length() == m2.getText().length() ) {
            return 0;
        }

        if(m1.getText().length() > m2.getText().length() ) {
            return 1;
        }

        return -1;
    }
}
