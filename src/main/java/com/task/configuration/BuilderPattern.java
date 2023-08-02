package com.task.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class BuilderPattern {


    private String name;
    private String lastName;


    public BuilderPattern withName(String name) {
        this.name = name;
        return this;
    }

    public BuilderPattern withLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public BuilderPattern build(){
        return this;
    }

    public static void main(String[] args) {

        BuilderPattern builderPattern = new BuilderPattern()
                .withLastName("Rakesh")
                .withLastName("Y")
                .build();

        System.out.println(builderPattern);

        List<String> users  = new ArrayList<>();
        users.add("Rakesh");
        users.add("Rakesh");
        users.add("Rakesh");
        users.add("Rakesh");

        users = users.stream().peek(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(users);

        List<String> updatedUsers = users.stream().map(u -> u.toUpperCase()).collect(Collectors.toList());
        System.out.println(updatedUsers);

        System.out.println(new DateTime().plus(100));

    }
}
