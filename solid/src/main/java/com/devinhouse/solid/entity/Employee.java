package com.devinhouse.solid.entity;

import com.devinhouse.solid.abstracts.AbstractContract;

public class Employee {
    private String name;
    private Double salary;
    private AbstractContract contract;

    public Employee(String name, Double salary, AbstractContract contract) {
        this.name = name;
        this.salary = salary;
        this.contract = contract;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public AbstractContract getContract() {
        return this.contract;
    }

    public void setContract(AbstractContract contract) {
        this.contract = contract;
    }

}
