package edu.houseHolder.schoolproject.payload;

public class User {
    private int id;
    private String holder; // To suggest the holder of the house.
    private String notification; // To suggest the notification that is being sent out.

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    private String doer; // To suggest the person that this houseHold chore is being directed to.

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", holder='" + holder + '\'' +
                ", notification='" + notification + '\'' +
                ", doer='" + doer + '\'' +
                '}';
    }
}
