package rS_SDET_InterviewPrep;

public class SwapWithAndWoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=3;
		
		SwapWithAndWoTemp swap = new SwapWithAndWoTemp();
		swap.withTemp(a,b);
		swap.withoutTemp(a, b);
		
		

	}

	public void withoutTemp(int i, int j) {
		// TODO Auto-generated method stub
		i=i+j; //i=4, j=3
		j=i-j; //i=4, j=1
		i=i-j;
		
		System.out.println("a="+i+" and b="+j);
		
	}

	public void withTemp(int a, int b) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=b;
		b=a;
		a=temp;
		
		System.out.println("a="+a+" and b="+b);
		
		
		
	}

}
