// -9 -9 -9  1 1 1 
//  0 -9  0  4 3 2
// -9 -9 -9  1 2 3
//  0  0  8  6 6 0
//  0  0  0 -2 0 0
//  0  0  1  2 4 0
public class hourGlass {
    public static void main(String a[]){
        int arr[][]={{-9,-9,-9,0,0,0},
        {0,-9,0,4,3,2},
        {-9,-9,-9,1,2,3},
        {0,0,8,6,6,0},
        {0,0,0,-2,0,0},
        {0,0,1,2,4,0}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                arr[i+1][j+1]+
                arr[i+2][j]+arr[i+2][j+1] +arr[i+2][j+2];
                if(sum>max){
                    max=sum;
                }
            }
            }System.out.println(""+max);
        }
    }

// Output: 28