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
interface Greeting{
    void welcomingMessage();
    void goodbyeMessage();
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
class Staff extends Person implements Salary, Greeting{
    String education, position;

    @Override
    public void salaryToPay(double hours, double rate) {
        System.out.println("Salary to pay is " + hours * rate);
    }

    @Override
    public void salaryForOvertime(double overtimeHours, double overtimeRate) {
        System.out.println(name + "'s salary for overtime = " + overtimeHours * overtimeRate);
    }
    @Override
    public void welcomingMessage(){
        System.out.println("Dear " + name + ", we are happy to welcome you to our team! Hope you will " +
                "enjoy working with us.");
    }

    @Override
    public void goodbyeMessage(){
        System.out.println("Dear " + name + ", we are sorry that you will no longer be working with us. " +
                "We wish you to find you new place soon.");
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
class Client extends Person implements Greeting{
    @Override
    public void welcomingMessage(){
        System.out.println("Dear " + name + ", we are happy that you decided to chose our company! Hope you will " +
                "enjoy working with us.");
    }

    @Override
    public void goodbyeMessage(){
        System.out.println("Dear " + name + ", the project we were working on is over. " +
                "We are looking forward to work with you again.");
    }
}
public class ZadanieIV{
    public static void main(String[] args) throws IOException{
        Staff employee = new Staff();

        employee.initialize1();
        employee.print1();
        employee.welcomingMessage();

        Client client = new Client();
        client.initialize();
        client.welcomingMessage();
    }
}
