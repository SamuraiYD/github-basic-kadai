package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void dictio(String[]word) {
	 HashMap<String,String> humanMap = new HashMap<String,String>();

     humanMap.put("apple","りんご");
     humanMap.put("peach","桃");
     humanMap.put("banana","バナナ");
     humanMap.put("lemon","レモン");
     humanMap.put("pear","梨");
     humanMap.put("kiwi","キウイ");
     humanMap.put("strawberry","いちご");
     humanMap.put("grape","ぶどう");
     humanMap.put("muscat","マスカット");
     humanMap.put("cherry","さくらんぼ");
	
	
	for( int i = 0; i < word.length; i++ ) {
        
		if( humanMap.get(word[i])==null) {
			
			System.out.println(word[i] + "は辞書に存在しません");
			
		}else {
            System.out.println(word[i] + "の意味は"+humanMap.get(word[i]));
		}   
		
		
    }
	
	}
	
}
