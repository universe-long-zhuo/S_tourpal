package com.wyz.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyz.service.UserInfoService;
import com.wyz.mapper.UserInfoMapper;
import com.wyz.po.UserInfo;

// ҵ���--ʵ��

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource(name = "userInfoMapper")
	private UserInfoMapper userInfoMapper;

	
    // ��ȡʵ�����userNumber������admin
	public UserInfo getUser(String userNumber) {
		System.out.println("ҵ���߼��㣺" + userNumber);
		return userInfoMapper.selectByPrimaryKey(userNumber);
	}




}
