package com.liu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.po.UserInfo;
import com.liu.service.UserInfoService;

/**
 * �û�����Ŀ�����
 * 
 * @author ��ţ
 * 
 */
@Controller
@RequestMapping("/userinfo/")
public class UserInfoController {

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;

	/**
	 * ���
	 * 
	 * @param user
	 * @param nodel
	 * @return
	 */
	@RequestMapping("add.do")
	public String add(UserInfo user, Model model) {
	
		try {
			 userInfoService.add(user);
			model.addAttribute("info", "�����ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("info", "����ʧ��");
		}


		return "jsp/admin/userinfo/userinfo_info";
	}
	
	/**
	 * ��ѯ�û���Ϣ
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("list.do")
	public String list(UserInfo user, Model model){
		List<UserInfo> list = userInfoService.getUserList(user);
		model.addAttribute("list", list);
		
		return "jsp/admin/userinfo/userinfo_list";
	}
	
	/**
	 * �����޸�ҳ��
	 * @param userNumber
	 * @param model
	 * @return
	 */
	@RequestMapping("load.do")
	public String load(String userNumber,Model model){
		
		UserInfo user = userInfoService.getUser(userNumber);
		model.addAttribute("user", user);
		
		return "jsp/admin/userinfo/userinfo_update";
	}

	
	/**
	 * �޸��û���Ϣ
	 * 
	 * @param user
	 * @param nodel
	 * @return
	 */
	@RequestMapping("update.do")
	public String update(UserInfo user, Model model) {
		boolean mark = false;
		try {
			mark = userInfoService.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (mark) {
			model.addAttribute("info", "�����ɹ�");
		} else {
			model.addAttribute("info", "����ʧ��");
		}

		return "jsp/admin/userinfo/userinfo_info";
	}
	
	/**
	 * ɾ���û���Ϣ
	 * 
	 * @param user
	 * @param nodel
	 * @return
	 */
	@RequestMapping("delete.do")
	public String delete(String userNumber, Model model) {
		boolean mark = false;
		try {
			mark = userInfoService.delete(userNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (mark) {
			model.addAttribute("info", "�����ɹ�");
		} else {
			model.addAttribute("info", "����ʧ��");
		}

		return "jsp/admin/userinfo/userinfo_info";
	}
	
	@RequestMapping("login.do")
	public String login(String userNumber,String userPw, Model model,HttpSession session){
		
		if(userNumber!=null&&!userNumber.equals("")){
			
			UserInfo user = userInfoService.getUser(userNumber);
			
			if(user!=null && user.getUserPw().equals(userPw)&&"����Ա".equals(user.getUserType())){
				session.setAttribute("userinfo", user);
				return "jsp/admin/index";
			}else{
				model.addAttribute("info", "�˺Ż��������");
			}
		
		}else{
			model.addAttribute("info", "�˺����벻��Ϊ��");
		}
		
		
		return "jsp/admin/login";
	}
	
	
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

}
