package table;

import java.io.Serializable;

//�˿ڱ�
public class Population implements Serializable{
  
	private  String  pId;    // ���֤
	 private  String  pName;  // ����
	 private  String  pDate;  // �Ǽ�����
	 private  String  pAddress;  // ���ص�ַ
	 private  String  pHRType;   //��������
	 private  String  pUsedName; // ������
	 private  Double  pHeight;   // ���
	 private  String  pSex;  // �Ա�
	 private  String  pBType;  // Ѫ��
	 private  String  pBornPlace; //������ַ
	 private  String  pNation; // ����
	 private  String  pNativePlace; //����
	 private  String  pBirthday; //��������
	 private  String  pRelation; //�뻧���Ĺ�ϵ
	 private  String  pDegree; //ѧ��
	 private  String  pMarry;  //����
	 private  String  pMilitary; //����
	 private  String  pReligions; //�ڽ�
	 private  String  pJob; //ְҵ
	 private  String  pOtherAdd; //������Ϣ
	 private  int     rId; //���
	 
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public String getpHRType() {
		return pHRType;
	}
	public void setpHRType(String pHRType) {
		this.pHRType = pHRType;
	}
	public String getpUsedName() {
		return pUsedName;
	}
	public void setpUsedName(String pUsedName) {
		this.pUsedName = pUsedName;
	}
	public Double getpHeight() {
		return pHeight;
	}
	public void setpHeight(Double pHeight) {
		this.pHeight = pHeight;
	}
	public String getpSex() {
		return pSex;
	}
	public void setpSex(String pSex) {
		this.pSex = pSex;
	}
	public String getpBType() {
		return pBType;
	}
	public void setpBType(String pBType) {
		this.pBType = pBType;
	}
	public String getpBornPlace() {
		return pBornPlace;
	}
	public void setpBornPlace(String pBornPlace) {
		this.pBornPlace = pBornPlace;
	}
	public String getpNation() {
		return pNation;
	}
	public void setpNation(String pNation) {
		this.pNation = pNation;
	}
	public String getpNativePlace() {
		return pNativePlace;
	}
	public void setpNativePlace(String pNativePlace) {
		this.pNativePlace = pNativePlace;
	}
	public String getpBirthday() {
		return pBirthday;
	}
	public void setpBirthday(String pBirthday) {
		this.pBirthday = pBirthday;
	}
	public String getpRelation() {
		return pRelation;
	}
	public void setpRelation(String pRelation) {
		this.pRelation = pRelation;
	}
	public String getpDegree() {
		return pDegree;
	}
	public void setpDegree(String pDegree) {
		this.pDegree = pDegree;
	}
	public String getpMarry() {
		return pMarry;
	}
	public void setpMarry(String pMarry) {
		this.pMarry = pMarry;
	}
	public String getpMilitary() {
		return pMilitary;
	}
	public void setpMilitary(String pMilitary) {
		this.pMilitary = pMilitary;
	}
	public String getpReligions() {
		return pReligions;
	}
	public void setpReligions(String pReligions) {
		this.pReligions = pReligions;
	}
	public String getpJob() {
		return pJob;
	}
	public void setpJob(String pJob) {
		this.pJob = pJob;
	}
	public String getpOtherAdd() {
		return pOtherAdd;
	}
	public void setpOtherAdd(String pOtherAdd) {
		this.pOtherAdd = pOtherAdd;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	@Override
	public String toString() {
		return "Population [pId=" + pId + ", pName=" + pName + ", pDate=" + pDate + ", pAddress=" + pAddress
				+ ", pHRType=" + pHRType + ", pUsedName=" + pUsedName + ", pHeight=" + pHeight + ", pSex=" + pSex
				+ ", pBType=" + pBType + ", pBornPlace=" + pBornPlace + ", pNation=" + pNation + ", pNativePlace="
				+ pNativePlace + ", pBirthday=" + pBirthday + ", pRelation=" + pRelation + ", pDegree=" + pDegree
				+ ", pMarry=" + pMarry + ", pMilitary=" + pMilitary + ", pReligions=" + pReligions + ", pJob=" + pJob
				+ ", pOtherAdd=" + pOtherAdd + ", rId=" + rId + "]";
	}
	
	  
	 
}
