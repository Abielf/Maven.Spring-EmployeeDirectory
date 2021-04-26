package io.zipcoder.persistenceapp;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    Long deptNum;
    //@Column(name="NAME")
    String name;

    //@Column(name="MANAGER")
    Long manager;

    protected Department(){}

    public Department(String dName, Long boss){
        name=dName;
        manager=boss;
    }

    public void setDeptNum(Long deptNum) {
        this.deptNum = deptNum;
    }

    public Long getDeptNum() {
        return deptNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setManager(Long manager) {
        this.manager = manager;
    }

    public Long getManager() {
        return manager;
    }

}