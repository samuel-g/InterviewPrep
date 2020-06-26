import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Give a list of student test scores, find the best average grade 
 * Each student may have more then one test score in the list
 * Return 0 for an empty input
 */

public class BestAverageGrade {
	
	public Integer bestAverageGrade(String[][] scores) throws Exception {
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> count = new HashMap<>();
		
		if(scores.length==0) return 0;
		
		for(int arr = 0; arr < scores.length; arr++) {
			String studentName = scores[arr][0];
			int score = Integer.parseInt(scores[arr][1]);
			
			if(score>100) throw new Exception("Invalid Score!");

			if(hashMap.containsKey(scores[arr][0])) {
				hashMap.put(studentName, (hashMap.get(studentName) + score));
				count.put(studentName, count.get(studentName)+1);
			}else {
				hashMap.put(studentName, score);
				count.put(studentName, 1);
			}
		}		
		
		for(String studentName : hashMap.keySet()) {
			hashMap.put(studentName, hashMap.get(studentName) / count.get(studentName));
		}
		
		
		return Collections.max(hashMap.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getValue();
	}

}
