package table;

import java.io.Serializable;

//������
public class Residence implements Serializable{
	
	private int rId; //���ں�
	private String pId; //�˿����֤
	
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
