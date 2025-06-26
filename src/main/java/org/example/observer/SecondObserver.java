package org.example.observer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SecondObserver implements Observer {
    private String name;
    private Subject subject;

    public SecondObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String name) {
        this.name = name;
        showName();
        writeToFile();
    }

    public void showName() {
        System.out.println("Second Observer: Hello, " + name + "!");
    }

    public void writeToFile() {
        String dateString = ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String logMessage = String.format("%s: %s%s", name, dateString, System.lineSeparator());
        String filename = "log.txt";

        try {
            Files.writeString(Path.of(filename), logMessage, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}

