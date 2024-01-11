package com.maielearn;

import com.maielearn.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootShiroApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void test01() {
        System.out.println(userMapper.selectById('1'));
    }
}
