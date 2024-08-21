package encapsulation2;

import encapsulation1.Employees;

public class AddAndDisplayEmployees{
    public static void main(String[] args) {

        //This is Encapsulation-

        //Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit.
        // In encapsulation, a class's variables are hidden from other classes and can only be accessed by the-
        // -methods of the class in which they are found.

        //If we have to access the variable present in Employee class,how can we do that.
        //Ans - We have to create object of that class to access the variables of that class.

        Employees e1 = new Employees();

        e1.setEmpId(1614340003);
        e1.setName("Abhinav");
        e1.setEmail("abhinav@gmail.com");
        e1.setAge(26);
        e1.setMobileNum("+91 7229832722");
        e1.setDesignation("SDE-1");

        System.out.println(e1);

        System.out.println(e1.getEmpId());
        System.out.println(e1.getName());
        System.out.println(e1.getEmail());
        System.out.println(e1.getAge());
        System.out.println(e1.getMobileNum());
        System.out.println(e1.getDesignation());
    }
}
