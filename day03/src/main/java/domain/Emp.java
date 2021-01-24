package domain;

import java.util.Date;

/**
 * @description: Emp
 * @author: st
 * @create: 2021-01-24 11:22
 **/

public class Emp {
    private int id;
    private String name;
    private Date join_date;
    private Integer dept_id;
    private Double salary;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", join_date=" + join_date +
                ", dept_id=" + dept_id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
