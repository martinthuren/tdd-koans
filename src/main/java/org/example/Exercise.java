package org.example;

public class Exercise {

    //Requirement 1 -
    // Write a method greet(name) that interpolates name in a simple greeting.
    // For example, when name is "Bob", the method should return a string "Hello, Bob.".


    //Requirement 2 -
    // Handle nulls by introducing a stand-in. For example, when name is null,
    // then the method should return the string "Hello, my friend."

    //Requirement 3 -
    //Handle shouting. When name is all uppercase, then the method should shout back to the user.
    // For example, when name is "JERRY" then the method should return the string "HELLO JERRY!"

    //Requirement 4 -
    //Handle two names of input. When name is an array of two names,
    // then both names should be printed. For example, when name is ["Jill", "Jane"], then the method should return the string "Hello, Jill and Jane."


    public static String[] greet(String name) {

        if (name == null)
            return new String[]{"Hello, my friend."};
        else if (name.toUpperCase().equals(name))
            return new String[]{"HELLO " + name + "!"};
        else if (name.contains(","))
            return name.split(",");
        else if (name.contains(" and "))
            return new String[]{"Hello, " + name + "." + "and" + name + "."};
        else
            return new String[]{"Hello, " + name + "."};

        }
    }
