class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        List = [1]
        
        count = 0
        while count < rowIndex:
            prev = 0
            for i in range(0, count + 1):
                if i < count:
                    hold = List[i + 1]
                    if 0 < i:
                        List[i + 1] = prev + hold
                    else:
                        List[i + 1] = hold + 1
                    prev = hold
            List.append(1)
            count += 1
        
        
        return List
