class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
    # To solve TwoSum, we did the following:
    # took target - num, saw if that result was already seen
    # If True: Return the two numbers that add up to the target 
    # Else: Add the difference to the seen list and move to the next one

    # ThreeSum -> find if 3 numbers add up to 0.
    # Step 1: make a dictionary of key value pairs of all item combinations.

        result = []

        for i, x in enumerate(nums):
            for y in nums[i+1]:
                for z in nums[i+2]:
                    if x + y + z == 0:
                        lo = min(x,y,z)
                        hi = max(x,y,z)
                        mid = (x + y + z) - lo - hi

                        if [lo,mid,hi] not in result:
                            result.append([lo,mid,hi])

        return result

