class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
	    int n = fruits.length;
        int count = 0;

        Set<Integer> used = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (fruits[i] <= baskets[j] && !used.contains(j)) {
                    count++;
                    used.add(j);
                    break;
                }
            }
        }

        return n - count;
    }
}
