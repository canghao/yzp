package site.canghao.yzp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.canghao.yzp.model.user;
import site.canghao.yzp.service.*;
import site.canghao.yzp.utils.wxUtil;

@ResponseBody
@Controller
@RequestMapping("/user")
public class userController {

	@Resource(name="userService")
	private userService userService;
	

    /**
     * @ ����ǰ���ṩ����ȥ΢�ŷ�������ȡ�û���ΨһopenId
     * @ ����Ψһ��openId��ѯuser�����û�и��û��򷵻�δ��½������ʾ�û���¼��������򷵻��û���Ϣ
     * @param appid
     * @param secret
     * @param code
     * @return
     * @
     */
	@RequestMapping("/isLogin")
    public Map<String,Object> isLogin(String appid,String secret,String code){
    	Map<String ,Object> map = new HashMap<String, Object>();
    	String openId = wxUtil.getWxuserOpenId(code, appid, secret);
    	user user = userService.getUserByOpenId(openId);
    	map.put("user",user);
		return map;
	}
	
	/**
	 * @ ��Ȩ��¼����������ǰ�˴���ȥ΢�ŷ�������ȡ�û���Ϣ�������û���Ϣ����user��
	 * @param appid
	 * @param secret
	 * @param encryptedData
	 * @param iv
	 * @param code
	 * @return
	 */
	@RequestMapping("/login")
	public Map<String,Object> login(String appid,String secret,String encryptedData, String iv, String code){
		Map<String ,Object> map = new HashMap<String, Object>();
		user user = wxUtil.getWxuserInfo(encryptedData, iv, code, appid, secret);
		boolean addUser = userService.addUser(user);
		if(addUser) map.put("msg","login is success");
		else map.put("msg","login is fail");
		map.put("user", user);
		return map;
	}
}
