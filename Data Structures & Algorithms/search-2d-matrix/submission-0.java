class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        while(i<m && target>matrix[i][n-1]){
            i++;
        }
        if(i==m){
            return false;
        }

        int l=0,r=n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(matrix[i][mid]==target){
                return true;
            }
            if(matrix[i][mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}
