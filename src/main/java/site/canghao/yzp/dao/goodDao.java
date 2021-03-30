package site.canghao.yzp.dao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import site.canghao.yzp.model.good;
import site.canghao.yzp.model.good_img;
import site.canghao.yzp.model.good_remark;
import site.canghao.yzp.model.good_remarks;

public interface goodDao {
	//������Ʒ��Ϣ
	@Insert("insert into good values(default,#{goodPublisher},#{goodDesc},#{goodPrice},#{goodStartPrice},#{goodSort},#{goodDeg})")
	public int addGood(good good);
	
	//ɾ����Ʒ��Ϣ
	@Delete("delete from good where goodId=#{goodId} and goodPublisher=#{goodPublisher}")
	public int deleteGood(good good);
	
	//������Ʒ��Ϣ
	@Update("update good set goodDes=#{goodDes},goodPrice=#{goodPrice},goodStartPrice=#{goodStartPrice},goodSort=#{goodSort},goodDeg=#{goodDeg}")
	public int updateGood(good good);
	
	//������Ʒ��ͼƬ
	public int addGoodImg(good_img good_img);

	//������Ʒ����
	@Insert("insert into good_remark values(default,#{goodId},#{remarkerId},#{remarkContent},#{remarkTime})")
	public int addGoodRemark(good_remark good_remark);
	
	//ɾ����Ʒ����
	@Delete("delete from good_remark where id=#{goodId} and remarkerId=#{remarkerId}")
	public int deleteGoodRemark(good_remark good_remark);
	
	//�������۵�¥
	@Insert("insert into good_remarks values(defalut,#{remarkId},#{remarkerId},#{objectorId},#{remarkContent},#{remarkTime})")
	public int addGoodRemarks(good_remarks good_remarks);
	
	//ɾ�����۵�¥
	@Delete("delete from good_remarks where id=#{id} and remarkerId={remarkerId}")
	public int deleteGoodRemarks(good_remarks good_remarks);
}
