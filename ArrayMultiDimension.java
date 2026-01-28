import java.util.*;
class ArrayMultiDimension {
    public static void matrixMultiplication(){
        int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] res= new int [3][3];
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    res[i][j] += arr1[i][k]* arr2[k][j];
                }
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void spiralTraversal(Scanner sc){
        int size= sc.nextInt();
        int [][] arr1= new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> res= new ArrayList<Integer>();
        int top=0, bottom=size-1, left=0, right= size-1;
        while( top <= bottom && left <=right){
            for(int i=left;i<=right;i++){
                res.add(arr1[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(arr1[i][right]);
            }
            right--;
            if (top <=bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr1[bottom][i]);
                }
            }
            bottom--;
            if(left <=right){
                for (int i=bottom;i>=top;i--){
                    res.add(arr1[i][left]);
                }
            }

            left++;

        }
        System.out.println(res);

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        matrixMultiplication();
        spiralTraversal(sc);
    }
}