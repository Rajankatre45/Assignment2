package in.ineuron.main;

public class bubblesort45{

	public static void main(String[] args) {

		int[] a= {66,12,324,654,987,2,45,18,79,87,100};
		
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		System.out.println("bubble sorted array:");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println();
	}
	
}
	