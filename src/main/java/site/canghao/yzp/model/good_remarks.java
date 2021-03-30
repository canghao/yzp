package site.canghao.yzp.model;

public class good_remarks {
	private int id;
	private int remarkId;
	private String remarkerId;
	private String objectorId;
	private String remarkContent;
	private String remarkTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRemarkId() {
		return remarkId;
	}
	public void setRemarkId(int remarkId) {
		this.remarkId = remarkId;
	}
	public String getRemarkerId() {
		return remarkerId;
	}
	public void setRemarkerId(String remarkerId) {
		this.remarkerId = remarkerId;
	}
	public String getObjectorId() {
		return objectorId;
	}
	public void setObjectorId(String objectorId) {
		this.objectorId = objectorId;
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
		return "good_remarks [id=" + id + ", remarkId=" + remarkId + ", remarkerId=" + remarkerId + ", objectorId="
				+ objectorId + ", remarkContent=" + remarkContent + ", remarkTime=" + remarkTime + "]";
	}
}
