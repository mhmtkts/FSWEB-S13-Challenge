package org.example;

import java.util.Arrays;

public class Employee {

    private  int id;
    private  String fullName;
    private  String email;
    private  String password;
    private  String[] healthPlans;

    public Employee(int id,String fullName, String password, String email, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
           return;

        }if (healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println("Health plan at index " + index + " is already set to " + healthPlans[index]);
        }



    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }



    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
