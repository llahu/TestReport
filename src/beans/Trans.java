package beans;
//这是建立数据模型
public class Trans {
	//板卡的序号
	private String bk;
	//三相电压的值
	private double ua;
	private double ub;
	private double uc;
	//三相电流的值
	private double ia;
	private double ib;
	private double ic;
	public String getBk() {
		return bk;
	}
	public void setBk(String bk) {
		this.bk = bk;
	}
	public double getUa() {
		return ua;
	}
	public void setUa(double ua) {
		this.ua = ua;
	}
	public double getUb() {
		return ub;
	}
	public void setUb(double ub) {
		this.ub = ub;
	}
	public double getUc() {
		return uc;
	}
	public void setUc(double uc) {
		this.uc = uc;
	}
	public double getIa() {
		return ia;
	}
	public void setIa(double ia) {
		this.ia = ia;
	}
	public double getIb() {
		return ib;
	}
	public void setIb(double ib) {
		this.ib = ib;
	}
	public double getIc() {
		return ic;
	}
	public void setIc(double ic) {
		this.ic = ic;
	}
	
}
