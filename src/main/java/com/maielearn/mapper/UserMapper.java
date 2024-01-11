package com.maielearn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maielearn.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
