package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    //로그인
    User getUserAccount(String userId);

    //회원가입
    void signUpUser(User user);

}
