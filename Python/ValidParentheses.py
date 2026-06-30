class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {"{": "}","[": "]","(":")"}
        size = 0
        
        for c in s:
            if c in map:
                stack.append(c)
            elif len(stack) == 0:
                return False
            elif map[stack[-1]] != c:
                return False
            else:
                stack.pop()

        return len(stack) == 0
