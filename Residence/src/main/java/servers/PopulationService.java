package servers;

import java.sql.SQLException;
import java.util.List;
import dao.PopulationDao;
import table.Population;



public class PopulationService {
	private PopulationDao pDao=new PopulationDao();
	
	//增加人口
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
	
	
	//删除人口
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
	
	//修改信息（迁入，迁出 -- 涉及修改时间 和 前往地址）
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
	
	
	//查询单个人员
		public List<Population> pSelect(int mun) {
			List<Population> pList=null;
			try {
				pList=pDao.populationSelect(mun);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return pList;
		}
		
		
	//查询所有人口
	public List<Population> pSelectAll() {
		List<Population> pList=null;
		try {
			pList=pDao.populationSelectAll();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}
	
	//统计人数
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

