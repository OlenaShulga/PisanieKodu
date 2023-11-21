package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZadanieII {
    static String surname, name, street, code, city;
    static void initialize() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname");
        surname = br.readLine();
        System.out.println("Enter name");
        name = br.readLine();
        System.out.println("Enter street");
        street = br.readLine();
        System.out.println("Enter code");
        code = br.readLine();
        System.out.println("Enter city");
        city = br.readLine();
    }
    static void print(){
        System.out.println("Person's data : ");
        System.out.println("surname : "+ surname);
        System.out.println("name : " + name);
        System.out.println("street : " + street);
        System.out.println("code : " + code);
        System.out.println("city : " + city);
    }
    public static void main(String[] args) throws IOException {
        initialize();
        print();
    }
}
