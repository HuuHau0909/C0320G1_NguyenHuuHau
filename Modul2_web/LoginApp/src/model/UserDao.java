package model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User kh1 = new User();
        kh1.setAge(10);
        kh1.setName("John");
        kh1.setAccount("john");
        kh1.setEmail("john@codegym.vn");
        kh1.setPassword("123456");
        users.add(kh1);

        User kh2 = new User("bill", "123456", "Bill", "bill@codegym.vn", 15);
        users.add(kh2);

        User kh3 = new User();
        kh3.setAge(16);
        kh3.setName("Mike");
        kh3.setAccount("mike");
        kh3.setEmail("mike@codegym.vn");
        kh3.setPassword("123456");
        users.add(kh3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
