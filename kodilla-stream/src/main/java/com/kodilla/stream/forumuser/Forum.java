package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser("Pablo", 'M', 1999, 5,
                5, 0, 190871) );
        theForumUserList.add(new ForumUser("Melania", 'F', 1989, 10,
                10, 1, 129032) );
        theForumUserList.add(new ForumUser("Ricky", 'M', 2005, 6,
                12, 22, 210943) );
        theForumUserList.add(new ForumUser("Marakesz", 'M', 1987, 5,
                21, 30, 103456) );
        theForumUserList.add(new ForumUser("Mariano", 'M', 2001, 11,
                13, 43, 103456) );
        theForumUserList.add(new ForumUser("Gabi", 'F', 1982, 12,
                1, 15, 103456) );
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }

}
