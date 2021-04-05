package array;

public class Sort012 {

	public static void main(String args[])
	{
		int a[] = {0,0,1,2,2,0};
		System.out.print(sort012(a,6));
	}


public static int[] sort012(int a[], int n)
{
    int low = 0, mid = 0, high = n-1;
    
    while(mid<=high)
    {
        switch(a[mid])
        {
            case 0: swap(a[low],a[mid]);
                    low++; mid++;
                    break;
            case 1: mid++;
                    break;
            case 2: swap(a[mid],a[high]);
                    high--;
                    break;
        }
    }
    return a;
}

private static void swap(int i, int j) {
	// TODO Auto-generated method stub
	int temp = i;
	i = j;
	j=temp;
	
}
}
