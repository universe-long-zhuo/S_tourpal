package com.liu.service;

import java.util.List;

import com.liu.po.UserInfo;

/**
 * �û������ҵ���߼��ӿ�
 * <p>
 * @author ��ţ
 * </P>
 * <p>
 * ʱ�䣺2015-09-30
 * </P>
 * 
 */
public interface UserInfoService {

	/**
	 * ����û���Ϣ
	 * 
	 * @param user
	 *            ����
	 * @return true�ɹ� falseʧ��
	 */
	public boolean add(UserInfo user);

	/**
	 * ��ѯ�û���Ϣ
	 * 
	 * @param record
	 *            ��ѯ����
	 * @return
	 */
	public List<UserInfo> getUserList(UserInfo record);

	/**
	 * �����˺Ų�ѯ�û���Ϣ
	 * 
	 * @param userNumber
	 * @return
	 */
	public UserInfo getUser(String userNumber);

	/**
	 * �޸��û���Ϣ
	 * 
	 * @param user
	 *            ����
	 * @return true�ɹ� falseʧ��
	 */
	public boolean update(UserInfo user);
	
	/**
	 * ɾ���û���Ϣ
	 * 
	 * @param userNumber
	 *            ����
	 * @return true�ɹ� falseʧ��
	 */
	public boolean delete(String userNumber);
}
