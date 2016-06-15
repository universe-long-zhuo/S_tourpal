package com.liu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.po.UserInfo;
import com.liu.po.ViewInfo;
import com.liu.service.UserInfoService;
import com.liu.service.ViewInfoService;

@Controller
@RequestMapping("/tourpal/")
public class TourpalController {

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userService;

	@Resource(name = "viewInfoServiceImpl")
	private ViewInfoService viewService;

	/**
	 * �û�ע��
	 * 
	 * @param userInfo
	 * @param model
	 * @return
	 */
	@RequestMapping("reg.do")
	public String reg(UserInfo userInfo, Model model) {

		if (userInfo != null) {
			userInfo.setUserType("��ͨ�û�");
		}

		boolean mark = userService.add(userInfo);
		if (mark) {
			// model.addAttribute("info", "�û�ע��ɹ������¼");
			return "login";
		} else {
			// model.addAttribute("info", "�û�ע��ʧ�ܣ�����������");
			return "reg";
		}
	}

	@RequestMapping("login.do")
	public String login(String userNumber, String userPw, Model model,
			HttpSession session) {

		if (userNumber != null && !userNumber.equals("")) {

			UserInfo user = userService.getUser(userNumber);
			System.out.println("=====��¼��" + user);

			if (user != null && user.getUserPw().equals(userPw)) {
				session.setAttribute("userinfo", user);

				return query(model);
			} else {
				model.addAttribute("info", "�˺Ż��������");
			}

		} else {
			model.addAttribute("info", "�˺����벻��Ϊ��");
		}

		return "login";
	}

	/**
	 * ��ѯ���еľ���
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("query.do")
	public String query(Model model) {
		List<ViewInfo> list = viewService.getList(null);
		model.addAttribute("list", list);
		return "index";
	}

	/**
	 * ���ݱ�Ų�ѯ������Ϣ
	 * 
	 * @param viewId
	 * @param model
	 * @return
	 */
	@RequestMapping("queryInfo.do")
	public String queryInfo(Integer viewId, Model model) {

		ViewInfo viewInfo = viewService.getInfo(viewId);

		model.addAttribute("viewinfo", viewInfo);

		return "view_info";
	}

	/**
	 * �޸�����
	 * @param user
	 * @param passWord
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("updatePw.do")
	public String updatePw(UserInfo user, String passWord, Model model,
			HttpSession session) {

		UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");

		if (passWord != null && userInfo != null
				&& passWord.equals(userInfo.getUserPw())) {
			
			boolean mark = userService.update(user);
			if(mark){
				model.addAttribute("info", "�����޸ĳɹ��������µ�¼");
				return "login";
			}
		}else{
			model.addAttribute("info", "ԭ�������벻��ȷ!");
		}

		return "user_password";
	}

	public void setUserService(UserInfoService userService) {
		this.userService = userService;
	}

	public void setViewService(ViewInfoService viewService) {
		this.viewService = viewService;
	}

}
