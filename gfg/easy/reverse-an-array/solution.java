class Solution {
    public void rev(int arr[],int i,int j){
        if(i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(arr,i+1,j-1);
    }
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        rev(arr,0,n-1);
    }
}