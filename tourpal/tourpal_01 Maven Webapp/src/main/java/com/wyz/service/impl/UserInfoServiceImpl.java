package com.wyz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyz.mapper.UserInfoMapper;
import com.wyz.po.UserInfo;
import com.wyz.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource(name = "userInfoMapper")
	private UserInfoMapper userInfoMapper;

	

	public UserInfo getUser(String userNumber) {
		System.out.println("ÒµÎñÂß¼­²ã£º" + userNumber);
		return userInfoMapper.selectByPrimaryKey(userNumber);
	}




}
