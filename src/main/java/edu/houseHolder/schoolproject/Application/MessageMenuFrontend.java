package edu.houseHolder.schoolproject.Application;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class MessageMenuFrontend {

    private Scanner scanner;

    public MessageMenuFrontend() {
        this.scanner = new Scanner(System.in);
    }

    public void run(MessageMenuBackend backend) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Send Message");
            System.out.println("2. Read Messages");
            System.out.println("3. Change Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    sendMessage(backend);
                    break;
                case 2:
                    readMessages(backend);
                    break;
                case 3:
                    changeStatus(backend);
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    return; // Exit the loop and the application
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void sendMessage(MessageMenuBackend backend) {
        System.out.println("Enter message details:");
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.print("Holder: \n");
        String holder = scanner.nextLine();
        System.out.print("Notification: \n");
        String notification = scanner.nextLine();
        System.out.print("Doer: \n");
        String doer = scanner.nextLine();

        // You should pass the correct parameters to the sendMessage method
        backend.sendMessage(title, holder, notification, doer, false);
    }

private void changeStatus(MessageMenuBackend backend) {
    System.out.println("Enter chore ID: ");
        int IntegerID = scanner.nextInt();

        String stringID = String.valueOf(IntegerID);
        backend.changeStatus(stringID);
}
    private void readMessages(MessageMenuBackend backend) {
        backend.readMessages();
    }
}

