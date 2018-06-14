package abc;

public class Next {
	
	public static void main(String[] args) {
		
		String str = "My Name Is Sahil Khatri. I am rap god";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length(); j++) {
				if((arr[i].charAt(j) == 'a') || (arr[i].charAt(j) == 'e') || (arr[i].charAt(j) == 'i') || (arr[i].charAt(j) == 'o') || (arr[i].charAt(j) == 'u')
						||(arr[i].charAt(j) == 'A') ||(arr[i].charAt(j) == 'E') ||(arr[i].charAt(j) == 'I') ||(arr[i].charAt(j) == 'O') ||(arr[i].charAt(j) == 'U'))
				{
					continue;
				}
				else
				{
					System.out.print(arr[i].charAt(j));
				}
				
			}
			System.out.print(" ");
		}
	}

}
