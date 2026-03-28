package org.example.oops.soild;

import org.example.steam.Employee;

public class MySqlDatabase implements Database{
    @Override
    public void save(Employee employee) {
        System.out.println("Employee saved " + employee);
    }
}
