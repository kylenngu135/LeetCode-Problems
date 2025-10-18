/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    int i = 0, j = numbersSize - 1;
    *returnSize = 2;
    int* ret = malloc(sizeof(int) * 2);

    while (i < j) {
        int val = numbers[i] + numbers[j];
        if (val > target) {
            j--;
        } else if (val < target) {
            i++;
        } else {
            ret[0] = i + 1;
            ret[1] = j + 1;
            break;
        }
    }

    return ret;
}
