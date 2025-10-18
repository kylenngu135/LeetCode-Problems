/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    int i = 0, j = numsSize - 1;
    int z = j;

    int* ret = malloc(sizeof(int)*numsSize);
    while (i <= j) {
        int left = nums[i] * nums[i];
        int right = nums[j] * nums[j];
        
        if (left > right) {
            ret[z] = left;
            i++;
        } else {
            ret[z] = right;
            j--;
        }
        z--;
    }

    *returnSize = numsSize;

    return ret;
}
