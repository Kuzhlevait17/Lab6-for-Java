package ru.kuzhleva.lab3.human;

public class Employee {
    private String name;
    private String department;
    private Employee boss;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.boss = null;
    }
    public Employee(String name, String department, boolean isBoss) {
        this.name = name;
        this.department = department;
        if (isBoss) {
            this.boss = this;
        }
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public boolean isBoss() {
        return this.boss == this;
    }

    @Override
    public String toString() {
        String bossName;
        if (isBoss() ){
            return name + " начальник отдела " + department;
        } else {
            if (boss != null) {
                bossName = boss.getName();
            } else {
                bossName = " не назначен";
            }
            return name + " работает в отделе " + department + ", начальник которого " + bossName;
        }
    }

}
