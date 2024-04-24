package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 rsp = new Jyanken_Chapter26();
		
	      
	      String mine = rsp.getMychoice();
	      
	      
	      String your = rsp.getRandom();
	      
	      rsp.playGame(mine,your);
	      
	      

	}

}
