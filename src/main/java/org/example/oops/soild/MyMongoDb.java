package org.example.oops.soild;

import org.example.steam.Employee;

import javax.xml.crypto.Data;

public class MyMongoDb implements Database {

    @Override
    public void save(Employee employee) {
        System.out.println("Employee saved " + employee);
    }
}

