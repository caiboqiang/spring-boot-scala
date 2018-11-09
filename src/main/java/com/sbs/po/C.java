package com.sbs.po;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 元数据（数据库元数据）MateDate
 */
@Entity //纳入spring管理
@Table //对应的A表
public class C {
    @Id
    @GeneratedValue
    private Integer id;
    private String names;
    private Integer age;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return names;
    }

    public void setName(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
