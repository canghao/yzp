package site.canghao.yzp.model;

import java.util.List;

public class good_img {
	private int goodId;
	private List<String> imgUrl;
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public List<String> getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(List<String> imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "good_img [goodId=" + goodId + ", imgUrl=" + imgUrl + "]";
	}
}
