import java.util.*;
class pangram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c[]=s1.toCharArray();
		HashSet<Character> hh=new HashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			continue;
			else
			{
				hh.add(c[i]);
			}
		}
		if(hh.size()==26)
		System.out.println("pangram");
		else
		System.out.println("not pangram");
	}
}
