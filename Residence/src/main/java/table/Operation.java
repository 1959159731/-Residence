package table;
import java.io.Serializable;

//暂住证表
public class Operation implements Serializable{
	
	private int oId; //暂住证ID	
	private String oGoDate; //办理日期
	private String oNnuboer; //联系电话
	private String pId;//身份证
	private String oToDate; //截止日期	
	private String oAddress; //暂住证居住地
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
	public String getoNnuboer() {
		return oNnuboer;
	}
	public void setoNnuboer(String oNnuboer) {
		this.oNnuboer = oNnuboer;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getoToDate() {
		return oToDate;
	}
	public void setoToDate(String oToDate) {
		this.oToDate = oToDate;
	}
	public String getoAddress() {
		return oAddress;
	}
	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}
	@Override
	public String toString() {
		return "Operation [oId=" + oId + ", oGoDate=" + oGoDate + ", oNnuboer=" + oNnuboer + ", pId=" + pId
				+ ", oToDate=" + oToDate + ", oAddress=" + oAddress + "]";
	}
	
	
	
	
}
