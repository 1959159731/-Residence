package table;

import java.io.Serializable;

//户籍表
public class Residence implements Serializable{
	
	private int rId; //户口号
	private String pId; //人口身份证
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	@Override
	public String toString() {
		return "Residence [rId=" + rId + ", pId=" + pId + "]";
	}
	
	 
	
	
}
