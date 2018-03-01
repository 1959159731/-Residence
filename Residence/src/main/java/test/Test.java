package test;

 
import servers.OperationService;
import servers.PopulationService;
import table.Operation;
import table.Population;
import table.Residence;
 

public class Test {
	public static void  main (String[] args) {
 
//		OperationService os = new OperationService();
//		Residence r = new Residence();
//		r.setrId(2);
//		r.setpId("611");
//		System.out.println(os.oSelect("611"));
		PopulationService ps =new PopulationService();
		System.out.println(ps.pSelect("311"));
		
		
	}
}
