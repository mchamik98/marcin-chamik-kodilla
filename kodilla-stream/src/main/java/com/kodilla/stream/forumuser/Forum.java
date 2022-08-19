package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        addUser(new ForumUser(1, "Maciej",      'M', LocalDate.of(2000,5,27),0  ));
        addUser(new ForumUser(2, "Marcin",    'M', LocalDate.of(1997,3,12),2 ));
        addUser(new ForumUser(3, "Oliwia",       'F', LocalDate.of(2011,4,17),0  ));
        addUser(new ForumUser(4, "Oliwier",     'M', LocalDate.of(2002,3,29),7  ));
        addUser(new ForumUser(5, "Kasia",       'F', LocalDate.of(1992,12,15) ,2 ));
        addUser(new ForumUser(6, "Piotr",       'M', LocalDate.of(2007,5,18),12  ));


    }

    public void addUser(ForumUser user){
        forumUsers.add(user);
    }

    public List<ForumUser> getForumUsers(){
        return new ArrayList<>(forumUsers);
    }


}