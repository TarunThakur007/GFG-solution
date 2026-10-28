class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (seen.add(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
