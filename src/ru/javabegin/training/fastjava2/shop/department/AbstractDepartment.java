package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.StaffInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<StaffInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<StaffInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<StaffInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsLkist) {
        this.goodsList = goodsList;
    }
}
