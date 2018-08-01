package com.re.newk;

public class Result {

    public Result(String username,String name,String course, String session){
        this.username = username;
        this.name = name;
        this.course = course;
        this.session = session;


    }
    public String username;
    public String name;
    public String course;
    public String session;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getSession() {
        return session;
    }
}
