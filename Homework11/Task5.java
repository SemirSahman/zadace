
public class Task5 {
	
	public static String getNumbersOnly(String s){
		String s2 = "";
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)>47 && s.charAt(i)<58){
				s2+=s.charAt(i);
			}
			
		
			
		}
		return s2;
	}
	

	public static void main(String[] args) {
		System.out.println(getNumbersOnly("1946 FK Sarajevo 1987"));
		
		

	}

}
