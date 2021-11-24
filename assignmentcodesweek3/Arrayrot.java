package assignmentcodesweek3;

public class Arrayrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=6;
		int num[]= {1,2,3,4,5};
		
		for(int k=0;k<count;k++) {
	
			for (int i=num.length-1;i>=0;i--)
	
		{
				int n=num[i];
		
		num[i]=num[i-1];
		num[i-1]=n;
			
		}
			System.out.println(num[k]);
			}
		}}