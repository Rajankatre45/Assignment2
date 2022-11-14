package in.ineuron.main;

class SelectionSort45
{
	void sort(int sel[])
	{
		int n = sel.length;
		for(int i=0;i<n-1;i++)
		{
			int minElem=i;
			for(int j=i+1;j<n;j++)
				if(sel[j]<sel[minElem])
					minElem=j;
			
			int tempVar = sel[minElem];
			sel[minElem]=sel[i];
			sel[i]=tempVar;
		}
	}
	
	void printArray(int sel[])
    {
        int n = sel.length;
        for (int i=0; i<n; ++i)
            System.out.print(sel[i]+" ");
        System.out.println();
    }
}
