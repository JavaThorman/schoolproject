package edu.houseHolder.schoolproject.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Application implements CommandLineRunner {

    private final MessageMenuFrontend frontend;
    private final MessageMenuBackend backend;

    @Autowired
    public Application(MessageMenuFrontend frontend, MessageMenuBackend backend) {
        this.frontend = frontend;
        this.backend = backend;
    }

    @Override
    public void run(String... args) {
        frontend.run(backend);
    }
}
