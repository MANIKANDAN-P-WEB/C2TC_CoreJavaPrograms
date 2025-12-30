package tnsprojects;

public class ForEachLoop {

	
		public static void main(String[] args) {
			int a[]= {50,60,70,80,90};	
	// integer array
			for(int i:a)
			{
			System.out.println(i);	
			}
			
			char ch[]= {'o','p','m','n'};
			for(char c:ch)
			{
				System.out.print(c);		
			}
			System.out.println(" ");
			String s1[]= {"i","learning","java","programming"};
	//String array
			for(String s:s1)
			{
				System.out.print(s+" ");		
			}
		}
	}

