package com.arex.mkill.domain;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String telphone;

    private String registerMode;

    private Integer thirdPatryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public Integer getThirdPatryId() {
        return thirdPatryId;
    }

    public void setThirdPatryId(Integer thirdPatryId) {
        this.thirdPatryId = thirdPatryId;
    }
}