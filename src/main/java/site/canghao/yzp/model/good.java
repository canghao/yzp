package site.canghao.yzp.model;

public class good {
	private int goodId;
	private String goodPublisher;
	private String goodDesc;
	private double goodPrice;
	private double goodStartPrice;
	private String goodSort;
	private String goodDeg;
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getGoodPublisher() {
		return goodPublisher;
	}
	public void setGoodPublisher(String goodPublisher) {
		this.goodPublisher = goodPublisher;
	}
	public String getGoodDesc() {
		return goodDesc;
	}
	public void setGoodDesc(String goodDesc) {
		this.goodDesc = goodDesc;
	}
	public double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}
	public double getGoodStartPrice() {
		return goodStartPrice;
	}
	public void setGoodStartPrice(double goodStartPrice) {
		this.goodStartPrice = goodStartPrice;
	}
	public String getGoodSort() {
		return goodSort;
	}
	public void setGoodSort(String goodSort) {
		this.goodSort = goodSort;
	}
	public String getGoodDeg() {
		return goodDeg;
	}
	public void setGoodDeg(String goodDeg) {
		this.goodDeg = goodDeg;
	}
	@Override
	public String toString() {
		return "good [goodId=" + goodId + ", goodPublisher=" + goodPublisher + ", goodDesc=" + goodDesc + ", goodPrice="
				+ goodPrice + ", goodStartPrice=" + goodStartPrice + ", goodSort=" + goodSort + ", goodDeg=" + goodDeg
				+ "]";
	}
}
