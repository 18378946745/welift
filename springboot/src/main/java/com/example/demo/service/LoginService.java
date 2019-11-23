package com.example.demo.service;
import com.example.demo.entity.User;

/**
 * @author sheng
 * @date 2019/11/21
 */
public interface UserService {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
