package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import database.DB_Manager;
import table.Population;

/**
 * PDao P������ݷ��ʶ���(�ṩ���ݺ����ݵĳ־�)
 * @author Administrator
 *
 */
	public class PopulationDao extends DB_Manager{
		
	//�����˿�
	public int populationSave(Population p)throws SQLException {
		Connection conn=this.openConnection();
		String sql="insert into population values(?,?,?,default,default,?,default,default,default,default,default,default,?,?,default,default,?,?,?,?,?,)";
		Object[] obs= {p.getpId(),p.getpName(),p.getpDate(),p.getpUsedName(),p.getpBirthday(),p.getpRelation(),p.getpMilitary(),p.getpReligions(),p.getpJob(),p.getpOtherAdd(),p.getrId()};
		int count=this.update(conn, sql, obs);
		this.closeConnection(conn);
		return count;
		
	}
	
	//ɾ���˿�
	public int populationDelete(int num)throws SQLException{
		Connection conn=this.openConnection();
		String sql="delete from population where pId=?";
		Object[] obs= {num};
		int count=this.update(conn, sql, obs);
		this.closeConnection(conn);
		return count;
	}
	
	
	//�޸���Ϣ��Ǩ�룬Ǩ�� -- �漰�޸�ʱ�� �� ǰ����ַ��
	public int populationUpdate(Population p)throws SQLException{
		Connection conn=this.openConnection();
		String sql="update population set pDate=?,pAddress=? where pId=?";
		Object[] obs= {p.getpDate(),p.getpAddress(),p.getpId()};
		int count=this.update(conn, sql, obs);
		this.closeConnection(conn);
		return count;
	}
 
	//��ѯ������Ա
	public List<Population> populationSelect(int mun)throws SQLException{
		Population p=null;
		List<Population> pList=new ArrayList<Population>();		
		Connection conn=this.openConnection();
		String sql="select * from Population where pId=?";
		Object[] obs= {mun};
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			p=new Population();
			p.setpId(rs.getString("pId"));
			p.setpName(rs.getString("pName"));
			p.setpDate(rs.getString("pDate"));
			p.setpAddress(rs.getString("pAddress"));
			p.setpHRType(rs.getString("pHRType"));
			p.setpUsedName(rs.getString("pUsedName"));
			p.setpHeight(rs.getDouble("pHeight"));
			p.setpSex(rs.getString("pSex"));
			p.setpBType(rs.getString("pBType"));
			p.setpBornPlace(rs.getString("pBornPlace"));
			p.setpNation(rs.getString("pNation"));
			p.setpNativePlace(rs.getString("pNativePlace"));
			p.setpBirthday(rs.getString("pBirthday"));
			p.setpRelation(rs.getString("pRelation"));
			p.setpDegree(rs.getString("pDegree"));
			p.setpMarry(rs.getString("pMarry"));
			p.setpMilitary(rs.getString("pMilitary"));
			p.setpReligions(rs.getString("pReligions"));
			p.setpJob(rs.getString("pJob"));
			p.setpOtherAdd(rs.getString("pOtherAdd"));
			p.setrId(rs.getInt("rId"));	
			pList.add(p);
		}
		this.closeConnection(conn);
		return pList;
	}
	
	
	//��ѯ�����˿�
	public List<Population> populationSelectAll()throws SQLException{
		List<Population> pList=new ArrayList<Population>();
		Connection conn=this.openConnection();
		String sql="select * from population";
		ResultSet rs=this.query(conn,sql,null);
		while(rs.next()) {
			Population p=new Population();
			p.setpId(rs.getString("pId"));
			p.setpName(rs.getString("pName"));
			p.setpDate(rs.getString("pDate"));
			p.setpAddress(rs.getString("pAddress"));
			p.setpHRType(rs.getString("pHRType"));
			p.setpUsedName(rs.getString("pUsedName"));
			p.setpHeight(rs.getDouble("pHeight"));
			p.setpSex(rs.getString("pSex"));
			p.setpBType(rs.getString("pBType"));
			p.setpBornPlace(rs.getString("pBornPlace"));
			p.setpNation(rs.getString("pNation"));
			p.setpNativePlace(rs.getString("pNativePlace"));
			p.setpBirthday(rs.getString("pBirthday"));
			p.setpRelation(rs.getString("pRelation"));
			p.setpDegree(rs.getString("pDegree"));
			p.setpMarry(rs.getString("pMarry"));
			p.setpMilitary(rs.getString("pMilitary"));
			p.setpReligions(rs.getString("pReligions"));
			p.setpJob(rs.getString("pJob"));
			p.setpOtherAdd(rs.getString("pOtherAdd"));
			p.setrId(rs.getInt("rId"));
			pList.add(p);
		}
		this.closeConnection(conn);
		return pList;
	}
	
	
	
	//ͳ������
	public int populationNum() throws SQLException {
		Connection conn = this.openConnection();
		Statement  stm = conn.createStatement();
		String sql="select count(pId) pCount from population";
		ResultSet rs = stm.executeQuery(sql);
		int count = 0;
		if(rs.next()) {
			count = rs.getInt("pCount");
		}
		this.closeConnection(conn);
		return count;
	}
}

