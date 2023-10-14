# HouseHolder Schoolproject-app

## Project Setup Guide

Welcome to the HouseHolder Schoolproject-app! This guide will walk you through the steps to set up your development environment for this project. Ensure you follow these installation steps before launching the program.

### Prerequisites

1. **IDE and JDK**:
   - Ensure that you have an Integrated Development Environment (IDE) installed, such as IntelliJ IDEA.
   - You'll also need Java Development Kit (JDK) 21.

2. **Apache Kafka**:
   - Download the latest version of Apache Kafka from [here](https://kafka.apache.org/downloads).
   - Extract the downloaded files to a directory of your choice.

3. **MongoDB Compass**:
   - Download the latest version of MongoDB Compass from [here](https://www.mongodb.com/try/download/compass).
   - Follow the installation instructions.

4. **GitHub Repository**:
   - Clone this GitHub repository to your local computer. You have two options:
      - Clone via GitHub: `git clone https://github.com/your-username/repository-name.git`
      - Alternatively, you can download the project as a zip file:
         - Extract the downloaded zip file.
         - Open the project in your preferred IDE.

### Configuring Apache Kafka

This application uses a single Kafka Broker. To set this up, follow these steps:

1. **Copy and Rename Properties Files**:
   - Navigate to your Apache Kafka directory's "config" folder.
   - Open the `server.properties` file in your preferred IDE or text editor.

2. **Configure Broker Property**:
   - Inside the `server.properties` file, make the following modifications:
      - Update the broker configuration by adjusting the `broker.id` property to `0` (e.g., `broker.id=0`).
      - Adjust the `log.dirs` section at line 62. For reference, here's an example: `log.dirs=C:/Users/YourUsername/Extraction-site/kafka/kafka-logs`.
         - Replace `YourUsername` with your actual username of the device used.
         - The `kafka-logs` folder is a location you need to create to organize log data. Make the folder within the Kafka map. 

### Start the Program (For Windows)

To start the HouseHolder Schoolproject-app on Windows, follow these steps:

1. **Open Your Preferred IDE**:
    - Launch your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA.

2. **Open the Project**:
    - Open the HouseHolder Schoolproject-app project within your IDE.

3. **Open Command Terminals**:
    - Open two Command Prompt (CMD) terminals on your Windows machine.

4. **Start Kafka Server and Zookeeper**:
    - In the first CMD terminal, navigate to your Kafka installation directory (where you extracted Kafka).
    - Start the Kafka server using the following command:
      ```shell
      .\bin\windows\kafka-server-start.bat .\config\server.properties
      ```
    - In a separate CMD terminal, also in your Kafka directory, start Zookeeper with this command:
      ```shell
      .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
      ```

5. **Launch the Application**:
    - In your IDE, run or start the HouseHolder Schoolproject-app.

6. **Enjoy the Application**:
    - Once the application is launched, it should be up and running. Access it through your preferred web browser or follow any specific instructions provided in the project's documentation.

### Start the Program (For Linux)

To start the HouseHolder Schoolproject-app on Linux, follow these steps:

1. **Open Your Preferred IDE**:
    - Launch your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA, from your Linux environment.

2. **Open the Project**:
    - Open the HouseHolder Schoolproject-app project within your IDE.

3. **Open Terminal Windows**:
    - Open two terminal windows in your Linux environment. You can use your system's built-in terminal or a terminal emulator of your choice.

4. **Start Kafka Server and Zookeeper**:
    - In the first terminal window, navigate to your Kafka installation directory (where you've installed Kafka).
    - Start the Kafka server using the following command:
      ```shell
      bin/kafka-server-start.sh config/server.properties
      ```
    - In a separate terminal window, also in your Kafka directory, start Zookeeper with this command:
      ```shell
      bin/zookeeper-server-start.sh config/zookeeper.properties
      ```

5. **Launch the Application**:
    - In your IDE, run or start the HouseHolder Schoolproject-app.

6. **Enjoy the Application**:
    - Once the application is launched, it should be up and running. Access it through your preferred web browser or follow any specific instructions provided in the project's documentation.

## Feedback and Support

If you encounter any issues, have questions, or would like to provide feedback on the HouseHolder Schoolproject-app, feel free to reach out to us through our GitHub repository's issue tracker. We're here to help and improve the project based on your input.

Thank you for choosing the HouseHolder Schoolproject-app. Happy coding!


