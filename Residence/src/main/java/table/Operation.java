package table;
import java.io.Serializable;

//��ס֤��
public class Operation implements Serializable{
	
	private int oId; //��ס֤ID	
	private String oGoDate; //��������
	private String oNnuboer; //��ϵ�绰
	private String pId;//���֤
	private String oToDate; //��ֹ����	
	private String oAddress; //��ס֤��ס��
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
