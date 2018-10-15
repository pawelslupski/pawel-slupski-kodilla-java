package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
            Map<Integer, ForumUser> theMapOfForumUsers = forum.getList().stream()
                    .filter(forumUser -> forumUser.getSex() == 'M')
                    .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 1998)
                    .filter(forumUser -> forumUser.getPostQuantity() >= 1)
                    .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

            System.out.println("#Elements: " + theMapOfForumUsers.size());
                theMapOfForumUsers.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);
    }

}
