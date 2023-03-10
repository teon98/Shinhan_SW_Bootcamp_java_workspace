package exam;

public class Prob2 {

	public static void main(String[] args) {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));
		
	}

	public static String leftPad(String str, int size, char fillChar){
		//구현하시오.....return값 수정할것 
		String result = "";
		
		try {
			if(size-str.length()<0) {
				throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
			}else {
				for(int i=0; i<size-str.length(); i++) {
					result += fillChar;
				}
				for(int j=0; j<str.length(); j++) {
					result += str.charAt(j);				
				}
			}
		}catch(IllegalSizeException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
			
		return result;

}
}

//구현하시오.
class IllegalSizeException extends Exception{
	 public IllegalSizeException() {}
	 public IllegalSizeException(String message) {
		 super(message);
	 }
}
