package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.JsonOps.Person;
import org.example.JsonOps.ReadJsonFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JsonOpsTest {
    private File file;


    @Test
    public void testJsonOps() {
        String jsonString = "src/main/java/org/example/JsonOps/person.json";
        Person person = (Person) ReadJsonFile.readJsonFileByFilePath(jsonString, new Person());
        assert person != null;
        System.out.println(person.getName());

    }
//    public static void main(String[] args) {
//        // Create an ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            // Read JSON file and convert it to a Java object
//            Person myObject = objectMapper.readValue(new File(, Person.class);
//
//            // Print the object
//            System.out.println(myObject);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
