package abc;

public class design {

	public static void main(String[] args) {

		String str = "we are looking for good writers.";
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			Character str2 = str1[i].charAt(0);
			//System.out.println(str1[i].charAt(0));
			String str3 = str2.toString().toUpperCase();
			System.out.print(str3);
			for (int j = 1; j < str1[i].length(); j++) {
				
				System.out.print(str1[i].charAt(j));
				
			}
			System.out.print(" ");
		}
		
	}
}
