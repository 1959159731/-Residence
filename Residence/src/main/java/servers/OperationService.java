package servers;

import java.sql.SQLException;
import dao.OperationDao;
import table.Operation;
import table.Population;
import table.Residence;

public class OperationService {
	private OperationDao oDao = new OperationDao();
	
	//���޸������������������ص�ַ
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
	
	//���컧�ڱ�(��ѯ���ڱ���Ϣ����)
	public Residence oSelect(String num1) {
		Residence r = null;
		try {
			r = oDao.operationSelect(num1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	//�������֤
	public Population pSelect(String num2) {
		Population p = null;
		try {
			p = oDao.populationSelect(num2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}		
		

	//����ס֤
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
