package exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		List<Integer> list = new ArrayList<>();
		int k = 0;
		int count =0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<answer.length;i++) {
			set.add(answer[i]);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			k = it.next();
			count = 0;
			for (int j = 0;j<answer.length;j++) {
				if(answer[j]==k) {
					count++;
				}
			}
			list.add(count);
			System.out.println(k+"의 갯수는 "+count+"개 입니다.");
		}
		
		
		
		

	}
}
