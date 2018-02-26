package dao;
import java.sql.Connection;
import java.sql.ResultSet; 
import java.sql.SQLException;
import database.DB_Manager;
import table.Operation;
import table.Population;
import table.Residence;


public class OperationDao extends DB_Manager{
	
	//���޸������������������ص�ַ
	public int operationUpdate(Population p) throws SQLException{
		Connection conn = this.openConnection();
		String sql="update population set pName=?, pUsedName=?, pAddress=? where pId=?";
		Object[] obs= {p.getpName(), p.getpUsedName(), p.getpAddress(), p.getpId()};
		int cont = this.update(conn, sql, obs);
		this.closeConnection(conn);
		return cont;
	}
	
	//���컧�ڱ�(��ѯ���ڱ���Ϣ����)
	public Residence operationSelect(String num1) throws SQLException{
		Residence r = null ;
		Connection conn = this.openConnection();
		String sql="select * from  Residence where pId=?";
		Object[] obj= {num1};
		ResultSet rs = this.query(conn, sql, obj);
		if(rs.next()) {
			r=new Residence();
			r.setrId(rs.getInt("rId"));
			r.setpId(rs.getString("pId"));
		}
		this.closeConnection(conn);
		return r;
	}
	
	//�������֤(��ѯ�����Ϣ����)
	public Population populationSelect(String num2) throws SQLException{
		Population p = new Population(); 
		Connection conn = this.openConnection();
		String sql="select pName, pBirthday, pId, pAddress from Population where pId=?";
		Object[] obj= {num2};
		ResultSet rs = this.query(conn, sql, obj);
		if(rs.next()) {
			p.setpName(rs.getString("pName"));
			p.setpBirthday(rs.getString("pBirthday"));
			p.setpId(rs.getString("pId"));
			p.setpAddress(rs.getString("pAddress"));
		}
		this.closeConnection(conn);
		return p;
	}
	
	//����ס֤
	public int operationSave(Operation o) throws SQLException{
		Connection conn = this.openConnection();
		String sql="insert into operation values(default,?,?,?,?,?)";
		Object[] obj= {o.getoId(), o.getoGoDate(), o.getoToDate(), o.getoNnuboer(), o.getoAddress()};
		int cont = this.update(conn, sql, obj);
		this.closeConnection(conn);
		return cont;
	}
	
}
