package abc;

public class Repeat {

	public static void main(String[] args) {

		Integer arr[] = { 1, 3, 23, 11 , 44,3,23,2,3};
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					
					System.out.print(arr[i]+" ");
					for (int j2 = j+1; j2 < arr.length; j2++) {
						if(arr[i]==arr[j2])
						{
							
							arr[j2]=null;
						}
					}
				}
			}
		}
		
	}
}
