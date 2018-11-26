package com.example.oliverh.jokewizard;

import com.example.oliverh.javajokes.JavaSmith;

public class JokeWizard {
    public String getJoke() {
        JavaSmith javaSmith = new JavaSmith();

        return javaSmith.getJoke();
    }
}
