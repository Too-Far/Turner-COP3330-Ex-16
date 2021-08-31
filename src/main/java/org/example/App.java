/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class App
{
    public static Function<String, Boolean> compileMessage(String oldEnough, boolean bail)
    {
        System.out.println(
                "You " + oldEnough + " old enough to legally drive."
        );
        return null;
    }

    public static void determineDrivingAge(int age)
    {
        int drivingAge = 16;
        final Function<String, Boolean> msg = (age >= drivingAge) ? compileMessage("are", false) : compileMessage("are not", false);
    }

    public static void getUserAge() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age;
        System.out.println("What is your age? ");
        age = Integer.parseInt(reader.readLine());
        determineDrivingAge(age);
    }
    public static void main( String[] args ) throws IOException {
        getUserAge();
    }
}
