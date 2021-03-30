package site.canghao.yzp.model;

public class good_remark {
	private int id;
	private int goodId;
	private String remarkerId;
	private String remarkContent;
	private String remarkTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getRemarkerId() {
		return remarkerId;
	}
	public void setRemarkerId(String remarkerId) {
		this.remarkerId = remarkerId;
	}
	public String getRemarkContent() {
		return remarkContent;
	}
	public void setRemarkContent(String remarkContent) {
		this.remarkContent = remarkContent;
	}
	public String getRemarkTime() {
		return remarkTime;
	}
	public void setRemarkTime(String remarkTime) {
		this.remarkTime = remarkTime;
	}
	@Override
	public String toString() {
		return "good_remark [id=" + id + ", goodId=" + goodId + ", remarkerId=" + remarkerId + ", remarkContent="
				+ remarkContent + ", remarkTime=" + remarkTime + "]";
	}
}
