import com.sun.tools.internal.ws.processor.model.ExtendedModelVisitor;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        //write your code here
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        return this.name;
        //write your code here
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        this.name = name;
        //write your code here
    }

    public void raiseSalary(double byPercent){
        this.salary = salary*byPercent/100;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    Employee employee;
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double tax = 0;
        if(employee.salary <= 8900){
            tax = employee.salary*0.062;
        }
        if(employee.salary > 8900){
            tax = 106800 * 0.62;
        }
        System.out.println("Employee's social secutiry tax is : " + tax);
        return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
        double res = 0;
        if(employee.age<35){
            res = employee.salary*0.03;
        }
        if (employee.age >=35 && employee.age<=50){
            res = employee.salary*0.04;
        }
        if(employee.age > 50 && employee.age <=60){
            res = employee.salary*0.05;
        }
        if(employee.age > 60){
            res = employee.salary*0.06;
        }
        System.out.println("The employee's contribution for insurance covarage is :" + res);
        return res;

    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        double[] res = new double[3];
        HashMap<Double,String> tmp = new HashMap<Double, String>();
        tmp.put(e1.salary,e1.name);
        tmp.put(e2.salary,e2.name);
        tmp.put(e3.salary,e3.name);
        res[0] = e1.salary;
        res[1] = e2.salary;
        res[2] = e3.salary;
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            System.out.println(tmp.get(res[i]));
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */

    public void tripleSalary(Employee employee) {
        //write your code here
        employee.salary = employee.salary*3;
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Assignment2 A = new Assignment2();
        A.employee = a;
        Assignment2 B = new Assignment2();
        B.employee = b;
        System.out.println("Before: a=" + A.employee.getName());
        System.out.println("Before: b=" + B.employee.getName());
        swap(A, B);
        System.out.println("After: a=" + A.employee.getName());
        System.out.println("After: b=" + B.employee.getName());
    }

    public static void swap(Assignment2 x, Assignment2 y) {
        Employee temp = x.employee;
        x.employee = y.employee;
        y.employee = temp;
    }
}