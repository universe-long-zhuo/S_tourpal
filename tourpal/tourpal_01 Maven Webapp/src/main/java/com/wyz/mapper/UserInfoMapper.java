package com.wyz.mapper;

import java.util.List;

import com.wyz.po.UserInfo;

// DAO²ã--½Ó¿Ú
public interface UserInfoMapper {
	
    UserInfo selectByPrimaryKey(String userNumber);

}