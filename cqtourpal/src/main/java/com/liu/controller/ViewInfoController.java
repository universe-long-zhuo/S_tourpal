package com.liu.controller;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.liu.po.UserInfo;
import com.liu.po.ViewInfo;
import com.liu.service.ViewInfoService;

@Controller
@RequestMapping("/viewinfo/")
public class ViewInfoController {

	@Resource(name = "viewInfoServiceImpl")
	private ViewInfoService service;

	/**
	 * ��Ӿ���
	 * 
	 * @param file
	 * @param viewinfo
	 * @param model
	 * @return
	 */
	@RequestMapping("add.do")
	public String add(
			@RequestParam(value = "file", required = false) MultipartFile file,
			ViewInfo viewinfo, Model model, HttpSession session) {

		// �ϴ���ַ
		String path = session.getServletContext().getRealPath("upload");
		System.out.println(path);

		String filename = UUID.randomUUID() + file.getOriginalFilename();
		System.out.println(filename);
		File targetFile = new File(path, filename);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

		UserInfo user = (UserInfo) session.getAttribute("userinfo");
		if (viewinfo != null) {
			viewinfo.setUserNumber(user.getUserNumber());
			viewinfo.setViewTime(new Date());
			viewinfo.setViewPhoto(filename);
		}

		try {
			file.transferTo(targetFile);
			boolean mark = service.add(viewinfo);
			if (mark) {
				model.addAttribute("info", "��Ӿ����ɹ�");
			} else {
				model.addAttribute("info", "��Ӿ���ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("info", "��Ӿ���ʧ��");
		}

		System.out.println(viewinfo);

		return "jsp/admin/viewinfo/viewinfo_info";
	}

	/**
	 * ��ѯ������Ϣ
	 * 
	 * @param info
	 * @param model
	 * @return
	 */
	@RequestMapping("list.do")
	public String list(ViewInfo info, Model model) {

		List<ViewInfo> list = service.getList(info);
		model.addAttribute("list", list);

		return "jsp/admin/viewinfo/viewinfo_list";
	}

	/**
	 * �����޸�ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("load.do")
	public String load(Integer viewId, Model model) {

		model.addAttribute("viewinfo", service.getInfo(viewId));

		return "jsp/admin/viewinfo/viewinfo_update";
	}

	/**
	 * ��Ӿ���
	 * 
	 * @param file
	 * @param viewinfo
	 * @param model
	 * @return
	 */
	@RequestMapping("update.do")
	public String update(
			@RequestParam(value = "file", required = false) MultipartFile file,
			ViewInfo viewinfo, Model model, HttpSession session) {

		// �ϴ���ַ
		String path = session.getServletContext().getRealPath("upload");
		System.out.println(path);

		String filename = UUID.randomUUID() + file.getOriginalFilename();
		System.out.println(filename);
		System.out.println(file.getOriginalFilename());
		if (viewinfo != null && file != null
				&& file.getOriginalFilename() != null
				&& !file.getOriginalFilename().equals("")) {
			viewinfo.setViewPhoto(filename);
			File targetFile = new File(path, filename);
			if (!targetFile.exists()) {
				targetFile.mkdirs();
			}
			try {
				file.transferTo(targetFile);

			} catch (Exception e) {
				e.printStackTrace();

			}
		}

		boolean mark = service.update(viewinfo);
		if (mark) {
			model.addAttribute("info", "�޸ľ����ɹ�");
		} else {
			model.addAttribute("info", "�޸ľ���ʧ��");
		}

		return "jsp/admin/viewinfo/viewinfo_info";
	}

	@RequestMapping("delete.do")
	public String delete(Integer viewId, Model model) {
		boolean mark = service.delete(viewId);
		if (mark) {
			model.addAttribute("info", "ɾ�������ɹ�");
		} else {
			model.addAttribute("info", "ɾ������ʧ��");
		}
		return "jsp/admin/viewinfo/viewinfo_info";
	}

	public void setService(ViewInfoService service) {
		this.service = service;
	}

}
