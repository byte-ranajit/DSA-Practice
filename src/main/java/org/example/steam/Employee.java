package org.example.steam;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String name;
    String department;
    double salary;
    int age;
    List<Employee> employee = new ArrayList<>();

    public Employee(int id, String name, String department, double salary, int age){
        this.id = id;
        this.name = name;
        this.department  = department;
        this.salary = salary;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Map<String, List<Employee>> groupEmployeesByDepartment(){
        return employee.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment));
    }

    public Map<String, Long> countEmployeesInEachDepartment(){
        return employee.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,Collectors.counting()));
    }

    public Employee findHighestSalaryEmployee(){
        return employee.stream().max(
                Comparator
                        .comparing(Employee::getSalary)).get();
    }

    public Map<String, Optional<Employee>> findHighestSalaryInEachDepartment(){
        return employee.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
    }

    public List<Employee> listEmployeesWithSalary_5000(){
        return employee.stream()
                .filter(
                        e -> e.getSalary() >  5000
                ).collect(Collectors.toList());
    }

    public static void fillterNameWithUpperCase(){
        // remove the null and all strings should be printed in uppercase
        List<String> nameList = Arrays.asList("ranajit",null,"ravan",null,"hanuman");
        List<String> list = nameList.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }

    public static List<String> fillterEmptyString(List<String> stringList){
        return stringList.stream()
                .filter(String::isEmpty)
                .toList();
    }

    public static List<Integer> evenNumbersList(List<Integer> numberList){
        return numberList.stream()
                .filter( n -> n % 2 == 0)
                .toList();
    }

    public static List<String> convertListToUpperCase(List<String> stringList){
        return stringList.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static int sumOfNumbers(List<Integer> nums){
        return nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static List<Integer> sortList(List<Integer> list){
        return list.stream().sorted().toList();
    }

    public static void compairInteger(){
        Integer a = 100;
        Integer b = 100;
        Integer x = 200;
        Integer y = 200;
        System.out.println(a.equals(b));
        System.out.println(x == y);
    }

    public static void arryElementSum(){
        int arr [] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0 ; i <= arr.length; i++){
            sum +=i;
        }
        System.out.println(sum);
    }

    public static boolean findVowels(String str){
        boolean hasVowles = false;
       for(char ch : str.toLowerCase().toCharArray()){
           if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               hasVowles = true;
               break;
           }
       }
        return hasVowles;
    }
    
}
