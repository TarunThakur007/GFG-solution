class Solution {
	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
		// code here
		Arrays.sort(arr);
          ArrayList<ArrayList<Integer>> li = new ArrayList<>();
          int i = 0, j = arr.length - 1;
          while (i < j) {
              int sum = arr[i] + arr[j];
              if (sum == 0) {
                  ArrayList<Integer> pair = new ArrayList<>();
                  pair.add(arr[i]);
                  pair.add(arr[j]);
                  li.add(pair);
                  int lastI = arr[i], lastJ = arr[j];
                  while (i < j && arr[i] == lastI) i++;  
                  while (i < j && arr[j] == lastJ) j--;
              } else if (sum < 0) {
                  i++;
              } else {
                  j--;
              }
          }
          return li;
	}
}
