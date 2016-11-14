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
		System.out.println("\n----------[ 函数参数 ]----------");
		System.out.println("参数1账号：" + userNumber);
		System.out.println("参数2密码：" + userPw);
		System.out.println("参数3模块：" + model);
		System.out.println("参数4会话：" + session);
		System.out.println("------------------------------");
		
		if (userNumber != null && !userNumber.equals("")) {

			// 创建一个实体类定义
			UserInfo user = userService.getUser(userNumber);
			System.out.println("=====登录获取实体：" + user);	

			if (user != null && user.getUserPw().equals(userPw)) {
				session.setAttribute("userinfo", user);

				//return query(model);
				System.out.println("登录成功了！");
				return "welcome";
			} else {
				model.addAttribute("info", "账号或密码错误 | 账号不存在！");
				System.out.println("假，equals等于{}:" + model);
			}

		} else {
			model.addAttribute("info", "账号密码不能为空");
			System.out.println("假，有字串{}:" + model);
		}

		System.out.println("失败了，跳转登录页面！");
		return "login";
	}

	

	public void setUserService(UserInfoService userService) {
		this.userService = userService;
	}


}
