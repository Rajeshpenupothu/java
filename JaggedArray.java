public class JaggedArray{
    public static void main(String a[]) {
    int nums [][]=new int[3][];
    nums[0]= new int[3];
    nums[1]= new int[4];
    nums[2]= new int[2];
    for (int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums[i].length;j++)
        {
           nums[i][j]=(int)(Math.random() *10);//*10 because .random actually uses double values ,so for double values we have decimal values to reduce that decimal values we have to multiply with 10 or 100 or 1000,but we must nd should multiply with any digit.
     
        }
    }
         for(int n[]:nums)
         {
            for(int m:n)
            {
                System.out.print(m +" ");
            }
          System.out.println();
         }  
    }
    } 
    

    