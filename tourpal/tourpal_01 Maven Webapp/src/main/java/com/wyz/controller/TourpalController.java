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
		System.out.println("\n----------[ �������� ]----------");
		System.out.println("����1�˺ţ�" + userNumber);
		System.out.println("����2���룺" + userPw);
		System.out.println("����3ģ�飺" + model);
		System.out.println("����4�Ự��" + session);
		System.out.println("------------------------------");
		
		if (userNumber != null && !userNumber.equals("")) {

			// ����һ��ʵ���ඨ��
			UserInfo user = userService.getUser(userNumber);
			System.out.println("=====��¼��ȡʵ�壺" + user);	

			if (user != null && user.getUserPw().equals(userPw)) {
				session.setAttribute("userinfo", user);

				//return query(model);
				System.out.println("��¼�ɹ��ˣ�");
				return "welcome";
			} else {
				model.addAttribute("info", "�˺Ż�������� | �˺Ų����ڣ�");
				System.out.println("�٣�equals����{}:" + model);
			}

		} else {
			model.addAttribute("info", "�˺����벻��Ϊ��");
			System.out.println("�٣����ִ�{}:" + model);
		}

		System.out.println("ʧ���ˣ���ת��¼ҳ�棡");
		return "login";
	}

	

	public void setUserService(UserInfoService userService) {
		this.userService = userService;
	}


}
