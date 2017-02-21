package sample;

/**
 * Created by JacobP on 2/20/17.
 */
public class Contact {
    String text;
    boolean isDone;

    public Contact(String text){
        this.text = text;
        this.isDone = false;
    }

    String Name;
    String Phone;
    String Email;

    public Contact(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        Email = email;
    }

    @Override
    public String toString(){
        return Name + Phone + Email;

    }
}
