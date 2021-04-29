package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null || output.isBlank()) {
            throw new IllegalArgumentException();
        }
        String separator = "";
        StringBuilder sb = new StringBuilder();
        for (Map.Entry item: contacts.entrySet()) {
            if (item.getKey() == null || item.getValue() == null) {
                throw new IllegalArgumentException();
            }
            String name = item.getKey().toString();
            String phoneNumber = item.getValue().toString();
            sb.append(separator);
            sb.append(name + ": " + phoneNumber);
            separator = "\n";
        }
        //String file = "src\\main\\resources\\" + output;
        String file = output;
        Path path = Path.of(file);
        try (BufferedWriter bw = Files.newBufferedWriter(path)){
            bw.write(sb.toString());
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot write file, ", ioe);
        }
    }
}
