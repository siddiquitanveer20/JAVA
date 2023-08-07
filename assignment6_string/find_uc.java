package assignment6_string;

public class find_uc {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("abccdesdffgfda");
	
		int i=0;
		int j=0;
		int uc=1;
		while (i < str.length() - 1) {
			j=i+1;
			while(j<str.length()) {
			if(str.charAt(i)==str.charAt(j))
			{
				str.deleteCharAt(j);
				j++;
				
			}
			else
			{
				j++;
			}
			}
			i++;
		
			uc=str.length();
		}
		System.out.println(uc);

	}

}
