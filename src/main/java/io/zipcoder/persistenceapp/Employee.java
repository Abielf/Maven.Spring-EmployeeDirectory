package io.zipcoder.persistenceapp;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    Long empNum;
    //@Column(name="FIRST_NAME")
    String firstName;
    //@Column(name="LAST_NAME")
    String lastName;
    //@Column(name="HIRE_DATE")
    String hireDate;
    //@Column(name="E_MAIL")
    String eMail;
    //@Column(name="PHONE_NUM")
    String phoneNum;
    //@Column(name="TITLE")
    String title;

    //@Column(name="DEPT_ID")
    Long deptNum;

    //@Column(name="MANAGER_ID")
    Long managerId;





    protected Employee(){}

    public Employee(String first, String last, String hired, String mail, String phone, String job, Long dept, Long boss){
        firstName=first;
        lastName=last;
        hireDate=hired;
        eMail=mail;
        phoneNum=phone;
        title=job;
        deptNum=dept;
        managerId=boss;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setDeptNum(Long deptNum) {
        this.deptNum = deptNum;
    }

    public Long getDeptNum() {
        return deptNum;
    }

    public void setManager(Long manager) {
        this.managerId = manager;
    }

    public Long getManager() {
        return managerId;
    }

    public void setEmpNum(Long empNum) {
        this.empNum = empNum;
    }

    public Long getEmpNum() {
        return empNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
