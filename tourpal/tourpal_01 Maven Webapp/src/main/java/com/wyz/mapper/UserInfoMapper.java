package com.wyz.mapper;

import java.util.List;

import com.wyz.po.UserInfo;

public interface UserInfoMapper {
	
    UserInfo selectByPrimaryKey(String userNumber);

}