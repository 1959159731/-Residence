package table;

import java.io.Serializable;

//人口表
public class Population implements Serializable{
  
	private  String  pId;    // 身份证
	 private  String  pName;  // 姓名
	 private  String  pDate;  // 登记日期
	 private  String  pAddress;  // 本地地址
	 private  String  pHRType;   //户籍类型
	 private  String  pUsedName; // 曾用名
	 private  Double  pHeight;   // 身高
	 private  String  pSex;  // 性别
	 private  String  pBType;  // 血型
	 private  String  pBornPlace; //出生地址
	 private  String  pNation; // 民族
	 private  String  pNativePlace; //籍贯
	 private  String  pBirthday; //出生日期
	 private  String  pRelation; //与户主的关系
	 private  String  pDegree; //学历
	 private  String  pMarry;  //婚姻
	 private  String  pMilitary; //兵役
	 private  String  pReligions; //宗教
	 private  String  pJob; //职业
	 private  String  pOtherAdd; //其他信息
	 private  int     rId; //外键
	 
	
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
