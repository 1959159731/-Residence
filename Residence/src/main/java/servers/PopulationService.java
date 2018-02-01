package servers;

import java.sql.SQLException;
import java.util.List;
import dao.PopulationDao;
import table.Population;



public class PopulationService {
	private PopulationDao pDao=new PopulationDao();
	
	//�����˿�
	public boolean pSave(Population p) {
		boolean bool=false;
		try {
			int count=pDao.populationSave(p);
			bool=count>0?true:false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	
	//ɾ���˿�
	public boolean pDelete(int mun) {
		boolean bool=false;
		try {
			int cont=pDao.populationDelete(mun);
			bool=cont>0?true:false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	//�޸���Ϣ��Ǩ�룬Ǩ�� -- �漰�޸�ʱ�� �� ǰ����ַ��
	public boolean pUpdate(Population p) {
		boolean bool=false;
		try {
			int count=pDao.populationUpdate(p);
			bool=count>0?true:false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	
	//��ѯ������Ա
		public List<Population> pSelect(int mun) {
			List<Population> pList=null;
			try {
				pList=pDao.populationSelect(mun);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return pList;
		}
		
		
	//��ѯ�����˿�
	public List<Population> pSelectAll() {
		List<Population> pList=null;
		try {
			pList=pDao.populationSelectAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}
	
	//ͳ������
	public int pNum() {
		int cont = 0;
		try {
			cont = pDao.populationNum();			 
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return cont;
	}
}

