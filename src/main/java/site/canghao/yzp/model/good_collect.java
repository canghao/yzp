package site.canghao.yzp.model;

public class good_collect {
	private int goodId;
	private String openId;
	private String collectTime;
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	@Override
	public String toString() {
		return "good_collect [goodId=" + goodId + ", openId=" + openId + ", collectTime=" + collectTime + "]";
	}
}
