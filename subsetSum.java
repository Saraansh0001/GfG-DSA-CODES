class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(0, 0, arr, result);
        return result;
    }

    private void helper(int index, int sum, int[] arr, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(sum);
            return;
        }

        // include
        helper(index + 1, sum + arr[index], arr, result);

        // exclude
        helper(index + 1, sum, arr, result);
    }
}
