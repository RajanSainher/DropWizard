/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.internfoxmula.hellodw.db;

/**
 *
 * @author sainh
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
import com.internfoxmula.hellodw.Employee;
 
public class EmployeeDB {
     
    public static HashMap<Integer, Employee> employees = new HashMap<>();
    static{
        employees.put(1, new Employee(1, "Lokesh", "Gupta", "India"));
        employees.put(2, new Employee(2, "John", "Gruber", "USA"));
        employees.put(3, new Employee(3, "Melcum", "Marshal", "AUS"));
    }
     
    public static List<Employee> getEmployees(){
        return new ArrayList<Employee>(employees.values());
    }
     
    public static Employee getEmployee(Integer id){
        return employees.get(id);
    }
     
    public static void updateEmployee(Integer id, Employee employee){
        employees.put(id, employee);
    }
     
    public static void removeEmployee(Integer id){
        employees.remove(id);
    }

   
}