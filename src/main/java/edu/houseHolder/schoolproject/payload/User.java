package edu.houseHolder.schoolproject.payload;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chores")
public class User {
    @Id
    private String _id; // MongoDB document ID

    private String title; // Chore title
    private String holder; // Chore holder
    private String notification; // Chore notification
    private String doer; // Chore doer
    private Boolean status; // Chore status (done or not)

    // Getters and setters for the fields

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    // Override the toString() method to provide a formatted string representation of the User object
    @Override
    public String toString() {
        return "Title & ID: '" + title + " & " + _id + "'\n" +
                "Holder: '" + holder + "',\n" +
                "Notification: '" + notification + "',\n" +
                "Doer: '" + doer + "'\n" +
                "Chore Done?: '" + status + "'\n";
    }
}
