package site.canghao.yzp.service;
import site.canghao.yzp.model.user;

public interface userService {
	public user getUserByOpenId(String openId);
	
	public boolean addUser(user user);
}
