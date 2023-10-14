# HouseHolder Schoolproject-app

Welcome to the HouseHolder Application!

Tired of endless debates over household chores? Say hello to the HouseHolder Application! It simplifies household management and chore delegation, whether you're a homeowner maintaining your space or a tenant sharing responsibilities with roommates.

## What's in Store?

With the HouseHolder Application, you can:

- **Assign Chores**: Easily delegate tasks to your household members.
- **Mark Chores as Done**: Track completed tasks.
- **User and HouseHolder Logins (Coming Soon)**: Dedicated spaces for efficient task management.

Now, that sounds like a chore revolution, doesn't it? Say goodbye to the chaos and welcome an organized and efficient way to manage your household tasks.



Enjoy your HouseHolder Schoolproject-app experience, and may your household run smoothly and harmoniously! If you have any questions, feedback, or need support, feel free to reach out through our GitHub repository's issue tracker. We're here to make your householder life a breeze.

Thank you for choosing the HouseHolder Schoolproject-app. Happy chore conquering!

---

## Project Setup Guide

This guide will walk you through setting up your development environment. Ensure you follow these steps before launching the program.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Configuring Apache Kafka](#configuring-apache-kafka)
- [Start the Program (For Windows)](#start-the-program-for-windows)
- [Start the Program (For Linux)](#start-the-program-for-linux)

### Prerequisites

Ensure you have:

1. **IDE and JDK**:
    - An Integrated Development Environment (IDE), like IntelliJ IDEA.
    - Java Development Kit (JDK) 21.

2. **Apache Kafka**:
    - Download the latest version from [here](https://kafka.apache.org/downloads).
    - Extract the files to your chosen directory.

3. **MongoDB Compass**:
    - Download the latest version from [here](https://www.mongodb.com/try/download/compass).
    - Follow the installation instructions.

4. **GitHub Repository**:
    - Clone this GitHub repository to your local computer:
        - Clone via GitHub: `git clone https://github.com/your-username/repository-name.git`
        - Or, download and extract the project zip file.

### Configuring Apache Kafka

This application uses a single Kafka Broker. To set it up:

1. **Copy and Rename Properties Files**:
    - Navigate to your Apache Kafka directory's "config" folder.
    - Open the `server.properties` file in your preferred IDE or text editor.

2. **Configure Broker Property**:
    - In the `server.properties` file:
        - Update the `broker.id` property to `0` (e.g., `broker.id=0`).
        - Adjust the `log.dirs` section at line 62. For example: `log.dirs=C:/Users/YourUsername/Extraction-site/kafka/kafka-logs`.
            - Replace `YourUsername` with your actual username.
            - Create the `kafka-logs` folder to organize log data within the Kafka directory.

### Start the Program (For Windows)

To start the HouseHolder Schoolproject-app on Windows:

1. **Open Your Preferred IDE**:
    - Launch your preferred Integrated Development Environment (IDE), like IntelliJ IDEA.

2. **Open the Project**:
    - Open the HouseHolder Schoolproject-app within your IDE.

3. **Open Command Terminals**:
    - Open two Command Prompt (CMD) terminals on your Windows machine.

4. **Start Kafka Server and Zookeeper**:
    - In the first CMD terminal, navigate to your Kafka installation directory (where you extracted Kafka).
    - Start the Kafka server with the command:
      ```shell
      .\bin\windows\kafka-server-start.bat .\config\server.properties
      ```
    - In a separate CMD terminal, also in your Kafka directory, start Zookeeper with this command:
      ```shell
      .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
      ```

5. **Launch the Application**:
    - Run the HouseHolder Schoolproject-app from your IDE.

6. **Enjoy the Application**:
    - Access the application through your preferred web browser or follow specific instructions provided in the project's documentation.

### Start the Program (For Linux)

To start the HouseHolder Schoolproject-app on Linux:

1. **Open Your Preferred IDE**:
    - Launch your chosen Integrated Development Environment (IDE), like IntelliJ IDEA, in your Linux environment.

2. **Open the Project**:
    - Open the HouseHolder Schoolproject-app within your IDE.

3. **Open Terminal Windows**:
    - Open two terminal windows in your Linux environment, using your system's built-in terminal or a terminal emulator of your choice.

4. **Start Kafka Server and Zookeeper**:
    - In the first terminal, navigate to your Kafka installation directory.
    - Start the Kafka server with this command:
      ```shell
      bin/kafka-server-start.sh config/server.properties
      ```

5. **Launch the Application**:
    - In your IDE, run or start the HouseHolder Schoolproject-app.

6. **Enjoy the Application**:
    - Once the application is launched, it should be up and running. Access it through your preferred web browser or follow any specific instructions provided in the project's documentation.

## Feedback and Support

If you encounter any issues, have questions, or would like to provide feedback on the HouseHolder Schoolproject-app, feel free to reach out to us through our GitHub repository's issue tracker. We're here to help and improve the project based on your input.

Thank you for choosing the HouseHolder Schoolproject-app. Happy coding!


