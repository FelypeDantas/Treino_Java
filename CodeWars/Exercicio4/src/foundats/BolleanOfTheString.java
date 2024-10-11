package foundats;

public class BolleanOfTheString {

	public static void main(String[] args) {
	
		boolean verdadeiro = true;
		boolean falso = false ;
		
		 System.out.println(booleanToString(verdadeiro)); 
	     System.out.println(booleanToString(falso)); 
	 }

	    public static String booleanToString(boolean b) {
	        if (b) {
	            return "true";
	        } else {
	            return "false";
	        }
	    }

}
