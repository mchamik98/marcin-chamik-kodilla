package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birth;
    private int posts = 0;

    public ForumUser(final int id, final String username, final char sex, final LocalDate birth, int posts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birth = birth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getAge(){
        return Period.between(birth,LocalDate.now()).getYears();
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return  "userID=" + id +
                ", userName='" + username + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", postCount=" + posts ;
    }
}
