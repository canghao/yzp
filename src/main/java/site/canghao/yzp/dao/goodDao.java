package site.canghao.yzp.dao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import site.canghao.yzp.model.good;
import site.canghao.yzp.model.good_img;
import site.canghao.yzp.model.good_remark;
import site.canghao.yzp.model.good_remarks;

public interface goodDao {
	//新增商品信息
	@Insert("insert into good values(default,#{goodPublisher},#{goodDesc},#{goodPrice},#{goodStartPrice},#{goodSort},#{goodDeg})")
	public int addGood(good good);
	
	//删除商品信息
	@Delete("delete from good where goodId=#{goodId} and goodPublisher=#{goodPublisher}")
	public int deleteGood(good good);
	
	//更新商品信息
	@Update("update good set goodDes=#{goodDes},goodPrice=#{goodPrice},goodStartPrice=#{goodStartPrice},goodSort=#{goodSort},goodDeg=#{goodDeg}")
	public int updateGood(good good);
	
	//新增商品的图片
	public int addGoodImg(good_img good_img);

	//新增商品评论
	@Insert("insert into good_remark values(default,#{goodId},#{remarkerId},#{remarkContent},#{remarkTime})")
	public int addGoodRemark(good_remark good_remark);
	
	//删除商品评论
	@Delete("delete from good_remark where id=#{goodId} and remarkerId=#{remarkerId}")
	public int deleteGoodRemark(good_remark good_remark);
	
	//新增评论的楼
	@Insert("insert into good_remarks values(defalut,#{remarkId},#{remarkerId},#{objectorId},#{remarkContent},#{remarkTime})")
	public int addGoodRemarks(good_remarks good_remarks);
	
	//删除评论的楼
	@Delete("delete from good_remarks where id=#{id} and remarkerId={remarkerId}")
	public int deleteGoodRemarks(good_remarks good_remarks);
}
