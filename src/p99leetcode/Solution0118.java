package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution0118 {
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);

		list.add(firstRow);

		for (int i = 1; i < numRows; i++) {
			List<Integer> next = new ArrayList<>();
			List<Integer> current = list.get(list.size() - 1);

			next.add(1);
			for (int j = 1; j < current.size(); j++) {
				next.add(current.get(j) + current.get(j - 1));
			}
			next.add(1);

			list.add(next);
		}
		return list;
		
		
		
		/*List<List<Integer>> answer = new ArrayList<>();
        
        for(int x=0; x<numRows; x++) {
            
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int i = 0; i < x; i++) {
                List<Integer> next = new ArrayList<>();

                next.add(1);
                for (int j = 1; j < row.size(); j++) {
                    next.add(row.get(j) + row.get(j - 1));
                }
                next.add(1);

                row = next;
            }           
            answer.add(row);
  
        }
        return answer;*/
    }
}
