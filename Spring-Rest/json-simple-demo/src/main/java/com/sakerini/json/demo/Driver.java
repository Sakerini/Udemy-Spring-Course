package com.sakerini.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();

            Student studentLite = mapper.readValue(new File("data/student-lite.json"), Student.class);
            System.out.println(studentLite.toString());

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
