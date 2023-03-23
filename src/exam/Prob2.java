package exam;
public class Prob2 {

	public static void main(String[] args) {
		
			System.out.println(leftPad("Samsung",10,'#'));
		
		
	
		
		
			System.out.println(leftPad("Multicampus",5,'@'));
		
			System.out.println(leftPad("SDS",5,'*'));
	}

	 

	public static String leftPad(String str, int size, char fillChar) throws IllegalSizeException{
		String result="";
		
		try {
			if(str.length()>=size) throw new IllegalSizeException("문자열의 길이보다 size가 큽니다. ");
			for (int i=0;i<size-str.length();i++) {
				result+=fillChar;
			}
			result+=str;
		}catch(IllegalSizeException e) {
			System.out.println(e.getMessage());
		}
		
//		if(str.length()>=size) {
//			throw new IllegalSizeException("문자열의 길이보다 size가 큽니다. ");
//		}
		
		
		
		return result;
	}

	
	
}

//구현하시오.
class IllegalSizeException extends RuntimeException {
	 public IllegalSizeException() {
		 
	 }

	public IllegalSizeException(String message) {
		super(message);
	}
	 
}



