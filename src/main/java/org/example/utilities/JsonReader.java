package org.example.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static User getUser(String path) {

        try {
            return new ObjectMapper().readValue(new File(path), User.class);
        } catch (IOException e) {
            Logs.error("ioexception: %s%n", e.getLocalizedMessage());
            throw new RuntimeException();
        }
    }


}
