package com.chudilka1.app.classwork.lesson11;


public class Student extends Person{ //class name

    private String university; //class fields
    private String response = "Ehhh, what was the question?";

    public Student(String name, String university){
        super(name); // calls parent (super) class constructor
        this.university = university; // extends with new properties
    }

    public String getResponse(String question){ // method
        return response;
    }
}
