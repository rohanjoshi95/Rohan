package study.reversestring;

public class ReverseString {
	
	private String string;

	public ReverseString(String string) {
		super();
		this.string = string;
	}
	
	public ReverseString()
	{
		
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public void revstring(String string)
	{
		
	        StringBuilder string2 = new StringBuilder();
	 
	        
	        string2.append(string);
	 
	        
	        string2 =  string2.reverse();
	 
	        
	        System.out.println(string2);
		
		
		
	}

}
