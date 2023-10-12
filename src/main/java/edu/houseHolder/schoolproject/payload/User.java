package edu.houseHolder.schoolproject.payload;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chores")
public class User {
    @Id
    private String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    private String id;

    private String title;

    private String holder;

    public String getId() {
        return _id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(String id) {
        this._id = id;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    private Boolean status;

    // Constructors, getters, setters, and other methods as needed

    @Override
    public String toString() {
        return  "Title & ID: '" + title + " & " + _id + "'\n" +
                "Holder: '" + holder + "',\n" +
                "Notification: '" + notification + "',\n" +
                "Doer: '" + doer + "'\n" +
                "Chore Done?: '" + status + "'\n";
    }

}
