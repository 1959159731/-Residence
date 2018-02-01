package table;

import java.io.Serializable;

public class Operation implements Serializable{
	private int oId;
	private String oGoDate;
	private String oToDate;
	private String oNnuboer;
	private String oAddress;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoGoDate() {
		return oGoDate;
	}
	public void setoGoDate(String oGoDate) {
		this.oGoDate = oGoDate;
	}
	public String getoToDate() {
		return oToDate;
	}
	public void setoToDate(String oToDate) {
		this.oToDate = oToDate;
	}
	public String getoNnuboer() {
		return oNnuboer;
	}
	public void setoNnuboer(String oNnuboer) {
		this.oNnuboer = oNnuboer;
	}
	public String getoAddress() {
		return oAddress;
	}
	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}
	
	
}
