package site.canghao.yzp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.canghao.yzp.model.user;
import site.canghao.yzp.service.userService;
import site.canghao.yzp.dao.userDao;
@Service("userService")
public class userServiceImpl implements userService {
	@Autowired
	private userDao userDao;
	
	@Override
	public user getUserByOpenId(String openId) {
		user user1 = userDao.getUserByOpenId(openId);
		return user1;
	}

	@Override 
	public boolean addUser(user user) {
		int addUser = userDao.addUser(user);
		if(addUser==1) return true;
		else return false;
	}
}
