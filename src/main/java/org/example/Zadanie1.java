package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Salary{
    void salaryToPay(double hours, double rate);
    default void salaryForOvertime(double overtimeHours, double overtimeRate){
        System.out.println("Salary for overtime = " + overtimeHours * overtimeRate);
    }
    static void bonus(int yearsOfExperience) {
        if (yearsOfExperience > 10) {
            System.out.println("Employee should recive bonus");
        } else System.out.println("Employee should not recive bonus");
    }
}
class Person{
    String surname, name, street, code, city;
    void initialize() throws IOException{
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
    void print(){
        System.out.println("Person's data : ");
        System.out.println("surname : "+ surname);
        System.out.println("name : " + name);
        System.out.println("street : " + street);
        System.out.println("code : " + code);
        System.out.println("city : " + city);
    }
}
class Staff extends Person implements Salary{
    String education, position;

    @Override
    public void salaryToPay(double hours, double rate) {
        System.out.println("Salary to pay is " + hours * rate);
    }

    @Override
    public void salaryForOvertime(double overtimeHours, double overtimeRate) {
        System.out.println(name + "'s salary for overtime = " + overtimeHours * overtimeRate);
    }

    void initialize1() throws IOException{
        initialize();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter education");
        education = br.readLine();
        System.out.println("Enter position");
        position = br.readLine();
    }
    void print1(){
        print();
        System.out.println("education : " + education);
        System.out.println("position : " + position);
    }

}
public class Zadanie1{
    public static void main(String[] args) throws IOException{
        Staff employee = new Staff();

        employee.initialize1();
        employee.print1();

        employee.salaryToPay(80, 25);
        Salary.bonus(6);
        employee.salaryForOvertime(5, 30);

        //employee.initialize();
        //employee.print();

        /*Person person = new Person();
        //person.initialize1();
        //person.print1();
        person.initialize();
        person.print();*/
    }
}
