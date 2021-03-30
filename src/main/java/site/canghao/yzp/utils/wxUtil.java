package site.canghao.yzp.utils;

import site.canghao.yzp.model.user;
import net.sf.json.JSONObject;

public class wxUtil {
	public static String getWxuserOpenId(String code,String appid,String secret) {
		String param = "appid=" + appid + "&secret=" + secret
				+ "&js_code=" + code + "&grant_type=authorization_code";
		String result=null;
		JSONObject json = null;
		try {
	      result=HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session",param);
	      json = JSONObject.fromObject(result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		System.out.println(json);
		System.out.println(json.getString("openid"));
	    return json.getString("openid");
	}
	
	public static user getWxuserInfo(String encryptedData, String iv, String code,String appid,String secret) {
        String params = "appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        JSONObject json = JSONObject.fromObject(sr);
        String session_key = json.get("session_key").toString();
        System.out.println(session_key);
        user user=new user();
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                JSONObject userInfoJson = JSONObject.fromObject(result);
                user.setNickName(userInfoJson.getString("nickName"));
                user.setAvatarUrl(userInfoJson.getString("avatarUrl"));
                user.setOpenId(userInfoJson.getString("openId"));
                user.setCity(userInfoJson.getString("city"));
                user.setCountry(userInfoJson.getString("country"));
                user.setProvince(userInfoJson.getString("province"));
                int gender = userInfoJson.getInt("gender");
                if(gender==1) user.setGender("ÄÐ");
                else user.setGender("Å®");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return user;
	}
}
