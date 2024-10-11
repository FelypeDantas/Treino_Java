package CodeWars;

public class Agulha {

	public static void main(String[] args) {
		String array[] = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
		String agulha = "needle";
		
		for(int i = 0; i < array.length; i ++) {
			if(agulha == array[i]) {
				System.out.println("found the needle at position " + i);
				break;
			}
		}

	}

}
