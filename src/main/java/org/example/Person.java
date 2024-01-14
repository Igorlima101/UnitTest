package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Integer age;
    private List<Person> all = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public boolean biggestThan18(){
        return getAge() >= 18;
    }




}
