package com.czxy.demo1.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by xps13 on 2019/3/19.
 */
public class Person implements Serializable {
    /** id 用于XmlUtils读写*/
    private String id;
    private String username;
    private String pwd;
    private String[] hobby;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
