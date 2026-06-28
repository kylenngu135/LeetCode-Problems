class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max = 0
        left = 0
        right = len(heights) - 1

        while left < right:
            leftPillar = heights[left]
            rightPillar = heights[right]
            totalWater = 0

            if leftPillar >= rightPillar:
                totalWater = rightPillar * (right-left)
                right -= 1
            else:
                totalWater = leftPillar * (right-left)
                left += 1

            if totalWater > max:
                max = totalWater


        return max
