package array;

public class CountPairsWithGivenSum18 {
    public static void main(String args[])
    {
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Output: 2

        int arr[] = {1, 1, 1, 1};
        int requiredSum = 2, count =0;
        int lenght =  arr.length;
        for(int i=0;i<lenght-1;i++)
        {
            int left = arr[i];
            for(int j = i+1; j<lenght;j++)
            {
                if(left+arr[j]==requiredSum)
                    count++;
            }
        }
        System.out.println(count);
    }
}
