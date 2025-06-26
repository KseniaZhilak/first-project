package org.example.decorator.outInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class InputTest {

    public static void main(String[] args) {
        new InputTest().writeToFile();

        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }


    public void writeToFile() {
        String logMessage = "Make to lowercase for: TESTING";
        String filename = "test.txt";

        try {
            Files.writeString(Path.of(filename), logMessage, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
