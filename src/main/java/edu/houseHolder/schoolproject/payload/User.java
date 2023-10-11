package edu.houseHolder.schoolproject.payload;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chores") // Replace "users" with your desired collection name
public class User {
    @Id
    private String id;

    private String holder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getDoer() {
        return doer;
    }

    public void setDoer(String doer) {
        this.doer = doer;
    }

    private String notification;
    private String doer;

    // Constructors, getters, setters, and other methods as needed

    @Override
    public String toString() {
        return
                "Holder: '" + holder + "',\n" +
                "Notification: '" + notification + "',\n" +
                "Doer: '" + doer + "'\n" +
                '}';
    }

}
