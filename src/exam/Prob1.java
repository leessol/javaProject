package exam;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성fff4488점","독고정진77점"};
		printMaxScore(array);
	}	
	private static void printMaxScore(String[] array){
		int s = 0;
		String name = "";
		int max = 0;
		for (int i =0;i<array.length;i++ ) {
			for (int j=0;j<array[i].length();j++) {
				if(48<=(int)array[i].charAt(j) && (int)array[i].charAt(j)<=57) {
					s = Integer.parseInt(array[i].substring(j,array[i].length()-1));
					if (max<s) {
						max=s;
						name=array[i].substring(0,j);
					}
					break;
				}
			}
		}
		System.out.println("최고점수는 " + name + "님 " + max + "점 입니다.");
	}	
}
