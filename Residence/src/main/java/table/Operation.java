package table;
import java.io.Serializable;

//��ס֤��
public class Operation implements Serializable{
	
	private int oId; //��ס֤ID
	private String pId;//���֤
	private String oGoDate; //��������
	private String oToDate; //��ֹ����
	private String oNnuboer; //��ϵ�绰
	private String oAddress; //��ס֤��ס��
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
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
	@Override
	public String toString() {
		return "Operation [oId=" + oId + ", pId=" + pId + ", oGoDate=" + oGoDate + ", oToDate=" + oToDate
				+ ", oNnuboer=" + oNnuboer + ", oAddress=" + oAddress + "]";
	}

	
	
}
