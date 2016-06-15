package com.wyz.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyz.po.UserInfo;
import com.wyz.service.UserInfoService;

@Controller
@RequestMapping("/tourpal/")
public class TourpalController {

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userService;
	

	@RequestMapping("login.do")
	public String login(String userNumber, String userPw, Model model,
			HttpSession session) {
		System.out.println("=====����1�˺ţ�" + userNumber);
		System.out.println("=====����2���룺" + userPw);
		
		if (userNumber != null && !userNumber.equals("")) {

			// ����һ��ʵ���ඨ��
			UserInfo user = userService.getUser(userNumber);
			System.out.println("=====��¼1��" + user);	

			if (user != null && user.getUserPw().equals(userPw)) {
				session.setAttribute("userinfo", user);

				//return query(model);
				return "welcome";
			} else {
				model.addAttribute("info", "�˺Ż�������� | �˺Ų����ڣ�");
			}

		} else {
			model.addAttribute("info", "�˺����벻��Ϊ��");
		}

		return "login";
	}

	

	public void setUserService(UserInfoService userService) {
		this.userService = userService;
	}


}
