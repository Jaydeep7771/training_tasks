package com.jaydeep.project;

import java.util.List;

public interface EmployeeDAO {
    public int addEmployee(Employee employee);
    public void getAllEmployee();
    public void deleteEmployee(int id);
    public void updateEmployee(int id,String name);
}
