package ru.kuzhleva.lab3.human;

import java.util.List;

public class EmployeeUpdate {
    private String name;
    //private String department;
    //private EmployeeUpdate boss;
    private Department department;

    //    public EmployeeUpdate(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }
//    public EmployeeUpdate(String name, String department, boolean isBoss) {
//        this.name = name;
//        this.department = department;
//        if (isBoss) {
//            //this.boss = this;
//        }
//    }
    public EmployeeUpdate(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null ) {
            department.addEmployee(this);
        }
    }

//    public void setBoss(EmployeeUpdate boss) {
//        //this.boss = boss;
//    }

    //    public String getDepartment() {
//        return department;
//    }
    public Department getDepartment() {
        return department;
    }
    public boolean isBoss() {
        //return this.boss == this;
        return this == department.getBoss();
    }
    public List<EmployeeUpdate> getDepartmentEmployees() {
        return department.getEmployees();
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String bossName;
//        if (isBoss() ){
//            return name + " начальник отдела " + department.getName() +
//                    "\nCотрудники отдела: " + getDepartmentEmployeesNames() + "\n";
//        } else {
//            //if (boss != null) {
//               // bossName = boss.getName();
//            //} else {
//            //    bossName = " не назначен";
//            //}
//            //return name + " работает в отделе " + department + ", начальник которого " + bossName;
//
        if (department.getBoss() == this) {
            return name + " - начальник отдела " + department.getName();
        }

        return name + " работает в отделе " + department.getName() +
                ", начальник - " +
                (department.getBoss() != null ? department.getBoss().getName() : "не назначен");
    }

}
