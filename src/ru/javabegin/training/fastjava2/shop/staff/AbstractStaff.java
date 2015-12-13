package ru.javabegin.training.fastjava2.shop.staff;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.StaffInterface;

public abstract class AbstractStaff implements StaffInterface {

    private String name;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}