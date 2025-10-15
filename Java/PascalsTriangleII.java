class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);

        for (int i = 0; i < rowIndex; i++) {
            result.add(1);
            int old = result.get(0);
            for (int j = 1; j <= i; j++) {
                int save = old;
                old = result.get(j);
                result.set(j, save + old);
            }
        }

        return result;
    }
}
