package org.example;

import org.apache.http.HttpException;

import static org.example.genimiAPI.GeminiAPI.*;

import org.testng.annotations.Test;

import java.io.IOException;

public class GeminiTest {
    @Test
    public void testGoogleAPI() throws HttpException, IOException {
        geminiAPIProcess("What is your name?");
        geminiAPIStreamContents("weather in Nigeria");

    }
}
