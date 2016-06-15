package com.liu.service;

import java.util.List;

import com.liu.po.ViewInfo;

/**
 * ���������ҵ���߼��ӿ�
 * @author ��ţ
 *
 */
public interface ViewInfoService {

	/**
	 * ��Ӿ���
	 * @param info
	 * @return
	 */
	public boolean add(ViewInfo info);
	
	/**
	 * ����������ѯ������Ϣ
	 * @param info
	 * @return
	 */
	public List<ViewInfo> getList(ViewInfo info);
	
	/**
	 * ���ݱ�Ų�ѯ������Ϣ
	 * @param viewId ���
	 * @return
	 */
	public ViewInfo getInfo(Integer viewId);
	
	/**
	 * �޸ľ�����Ϣ
	 * @param info
	 * @return
	 */
	public boolean update(ViewInfo info);
	
	/**
	 * ���ݱ��ɾ��������Ϣ
	 * @param viewId
	 * @return
	 */
	public boolean delete(Integer viewId);
	
}
