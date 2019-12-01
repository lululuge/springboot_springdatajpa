package com.luge;

import com.luge.dao.UserDao;
import com.luge.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = SpringbootSpringdatajpaApplication.class)
public class SpringDataJpaTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test1() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
