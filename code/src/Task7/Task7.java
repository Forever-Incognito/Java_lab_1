package Task7;

import java.util.Objects;

public class Task7 {
    public static void main(String[] args) {
    User firstuser = new User("Andrii", "Makoskyi", 18, "hotdog@ukr.net");
    User seconduser = new User("Tom", "Redul", 27, "lastsummer@ukr.net");

        System.out.println(firstuser.firstname.equals(seconduser.firstname));

        System.out.println(seconduser.age);

        System.out.println("HashCode of user1: " + firstuser.hashCode());
        System.out.println("HashCode of user2: " + seconduser.hashCode());
    }
}

