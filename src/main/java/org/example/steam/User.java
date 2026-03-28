package org.example.steam;

import java.util.List;
import java.util.stream.Collectors;

public class User {

    private int id;
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public User(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public User(){}

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    public List<User> getUsersUnder5KSalary(List<User> userList){
//        filter(Predicate<T>)
        return userList.stream()
                .filter( user -> user.getSalary() > 5000)
                .collect(Collectors.toList());
    }

    public List<String> getUserHighEarners(List<User> userList){
        return userList.stream()
                .filter(user -> user.getSalary() > 5000)
                .map(User::getName)
                .toList();

    }

    public static void main(String[] args) {
        List<User> userList = List.of(
                new User(1, "Ranajit", 2000),
                new User(2, "Rahul", 3500),
                new User(3, "Amit", 50000),
                new User(4, "Suman", 2500),
                new User(5, "Priya", 4000),
                new User(6, "Ankit", 3000)
        );

        User user = new User();
        System.out.println(user.getUsersUnder5KSalary(userList));

    }

}
