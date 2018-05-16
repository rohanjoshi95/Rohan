package study.duplicates;

public class UserDuplicate {

	public static void main(String[] args) {
		Duplicate dup=new Duplicate();
	       int[] arr = {1, 2, 2, 5, 5, 5, 6};
		dup.checkDuplicate(arr, 2);
	}

}
