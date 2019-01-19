package com.springboot.http.entity;

import java.util.Date;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/19 10:58 AM
 */
public class User {

    private String name;

    private int age;

    private Date Birthday;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Birthday=" + Birthday +
                '}';
    }

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        Birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }
}
