package site.canghao.yzp.dao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import site.canghao.yzp.model.user;

public interface userDao {
	//�����û���openId��ѯ
	@Select("select * from user where openId=#{openId}")
	public user getUserByOpenId(String openId);
	
	//����µ��û�
	@Insert("insert into user values(#{openId},#{nickName},#{gender},#{avatarUrl},#{city},#{province},#{country},#{iphone},#{qq})")
	public int addUser(user user);
}
