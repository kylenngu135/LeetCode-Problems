class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        int count = 1;
        while (count < numRows) {
            result.add(new ArrayList<Integer>());
            result.get(count).add(1);
            int prevLength = result.get(count - 1).size();
            for (int i = 0; i < prevLength; i++) {
                if (i + 1 < prevLength) {
                    result.get(count).add(result.get(count - 1).get(i) + result.get(count - 1).get(i + 1));
                } 
            }
            result.get(count).add(1);
            count++;
        }
        return result;     
    }
}
