package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMychoice(){
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
	      //Scannerクラスのオブジェクトを生成する
	      Scanner scanner = new Scanner(System.in);
			
	      //入力した内容を取得する
	      String input = scanner.nextLine();
	      
	      if(input.equals("r")||input.equals("s")||input.equals("p")) {
	    	  
	    	  scanner.close();
	  		
		      return input;
	    	  
	      }else {
	    	  System.out.println("Error");
	    	  continue;
	      }
			
			
	     
		}
	}
	
	public String getRandom(){
		
		String[]   RSP = { "r","s","p" };
		
	         //乱数の範囲で指定した2までの数値を切り下げして出力する
			int randNum = (int)Math.floor(Math.random() * 3);
	         
			//Math.floor(Math.random()*3);//
		String Enemy = RSP[randNum];
		return Enemy;
	}
	
	//0はグー、１はチョキ、２はぱー//
	
	public void playGame(String myKey,String enemyKey) {
		
		HashMap<String,String> handMap = new HashMap<String,String>();
		
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		
		
		if(myKey.equals(enemyKey)) {
			
			System.out.println("自分の手は" + handMap.get(myKey)+","+"対戦相手の手は"+handMap.get(enemyKey));
			System.out.println("あいこです");
			
		}else if(enemyKey.equals("r") && myKey.equals("s")||enemyKey.equals("p")&&myKey.equals("r")||enemyKey.equals("s")&&myKey.equals("p")){
			
			System.out.println("自分の手は" +  handMap.get(myKey) +","+"対戦相手の手は"+handMap.get(enemyKey));
			System.out.println("自分の負けです");
			
		}else {
			System.out.println("自分の手は" + handMap.get(myKey)+","+"対戦相手の手は"+handMap.get(enemyKey));
			System.out.println("自分の勝ちです");
        }
		
		
	}
	
	}
	

