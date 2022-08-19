package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumUser = forum.getForumUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getAge() >= 20)
                .filter(user -> user.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));


        forumUser.forEach((key, value) -> System.out.println("ID: " + key + " " + value.toString()));
    }
}