package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie {
    public static void main(String[] args) throws IOException {
        String a, b, c, d, e;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname");
        a = br.readLine();
        System.out.println("Enter name");
        b = br.readLine();
        System.out.println("Enter street");
        c = br.readLine();
        System.out.println("Enter code");
        d = br.readLine();
        System.out.println("Enter city");
        e = br.readLine();
        System.out.println("Person's data : ");
        System.out.println("surname : "+ a);
        System.out.println("name : " + b);
        System.out.println("street : " + c);
        System.out.println("code : " + d);
        System.out.println("city : " + e);
    }
}
