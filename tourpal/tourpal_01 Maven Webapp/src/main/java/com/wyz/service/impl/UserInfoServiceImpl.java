package com.wyz.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyz.service.UserInfoService;
import com.wyz.mapper.UserInfoMapper;
import com.wyz.po.UserInfo;

// 业务层--实现

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource(name = "userInfoMapper")
	private UserInfoMapper userInfoMapper;

	
    // 获取实体类的userNumber，例如admin
	public UserInfo getUser(String userNumber) {
		System.out.println("业务逻辑层：" + userNumber);
		return userInfoMapper.selectByPrimaryKey(userNumber);
	}




}
