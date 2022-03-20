package Week1Day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,b=1,c,i,count=10;
		System.out.println(A+" "+b);
		for(i=1;i<count;++i)
		{
			c=A+b;
			System.out.println(" "+c);
			A=b;
			b=c;
		}
		

	}

}
