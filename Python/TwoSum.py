class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        i = 0
        for num in nums:
            if target - num in dict:
                return [i, dict[target - num]]
            dict[num] = i
            i += 1

        
