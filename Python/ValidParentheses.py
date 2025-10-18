class Solution:
    def isValid(self, s: str) -> bool:
        Dict = {")" : "(", "]" : "[", "}" : "{"}
        j = -1
        List = list()

        for i in s:
            if i in Dict.values():
                List.append(i)
                j += 1
            elif j > -1:
                if Dict.get(i) == List[j]: 
                    List.pop(j)
                    j -= 1
                else:
                    return False
            else:
                return False

        return j == -1              
                                
