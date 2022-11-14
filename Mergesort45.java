package in.ineuron.main;

class Mergesort45
{
	void merge(int a3[], int left, int mid, int right) 
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int tempLeft[] = new int[n1];
		int tempRight[] = new int[n2];
		
		for(int i=0;i<n1;++i)
			tempLeft[i] = a3[left + i];
		for(int j=0;j<n2;++j)
			tempRight[j] = a3[mid+1+j];
		
		int i=0, j=0;
		
		int k=left;
		while(i<n1&&j<n2)
		{
			if (tempLeft[i] <= tempRight[j])
			{
				a3[k] = tempLeft[i];
				i++;
			}
			else
			{
				a3[k] = tempRight[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a3[k]=tempLeft[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a3[k] = tempRight[j];
			j++;
			k++;
		}
	}
	
	void sort(int a3[], int left, int right)
	{
		if(left<right)
		{
			int mid = left+(right-left)/2;
			sort(a3, left, mid);
			sort(a3,mid+1,right);
			
			merge(a3,left,mid,right);
		}
	}
	
	
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


