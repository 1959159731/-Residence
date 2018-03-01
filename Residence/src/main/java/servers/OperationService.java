package servers;

import java.sql.SQLException;
import dao.OperationDao;
import table.Operation;
import table.Population;
import table.Residence;

public class OperationService {
	private OperationDao oDao = new OperationDao();
	
	//可修改姓名，曾用名，本地地址
	public boolean oUpdate(Population p) {
		boolean bool = false;
 
		try {
			int cont = oDao.operationUpdate(p);
			bool=cont>0?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return bool;
	}
	
	//补办户口本(查询户口本信息即可)
	public Residence oSelect(String num1) {
		Residence r = null;
		try {
			r = oDao.operationSelect(num1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	//补办身份证
	public Population pSelect(String num2) {
		Population p = null;
		try {
			p = oDao.populationSelect(num2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}		
		

	//办暂住证
	public boolean oSave(Operation o) {
		boolean bool = false;		 
		try {
		int	cont = oDao.operationSave(o);
		bool=cont>0?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
}
