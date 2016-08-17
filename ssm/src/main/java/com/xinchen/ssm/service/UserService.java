package com.xinchen.ssm.service;

import java.util.List;

import com.xinchen.ssm.entity.User;

/**   
* @Description: 
* @author xinchen  
* @date 2016年8月14日 下午7:06:55   
*/
public interface UserService {
	/** 
	* @Title: loadUsers 
	* @Description: TODO 加载用户  
	* @return List<User>     
	*/
	public List<User> loadUsers();
	public List<User> loadUsers2();
	/** 
	* @Title: save
	* @Description: TODO 添加用户  
	* @return int   
	*/
	public int save(User user);
	/** 
	* @Title: uodate
	* @Description: TODO 修改用户  
	* @return int   
	*/
	public int update(User user);
	/** 
	* @Title: delete
	* @Description: TODO 删除用户  
	* @return int   
	*/
	public int delete(String userName);
	/** 
	* @Title: findone
	* @Description: TODO 查询用户  
	* @return int   
	*/
	public User findOne(String userName);
}
