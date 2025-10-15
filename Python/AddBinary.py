"""
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

"""
class AddBinary:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a) - 1
        j = len(b) - 1
        sum = ""
        oneChecker = False


        while i >= 0 or j >= 0:
            zero = "0"
            one = "1"
            if oneChecker:
                zero = "1"
                one = "0"
            if i >= 0 and j >= 0:
                if a[i] == "1" and b[j] == "1":
                    sum += zero
                    oneChecker = True
                elif a[i] == "1" or b[j] == "1":
                    sum += one
                else:
                    sum += zero
                    oneChecker = False
            elif i >= 0:
                if a[i] == "1":
                    sum += one
                else:
                    sum += zero
                    oneChecker = False
            else:
                if b[j] == "1":
                    sum += one
                else:
                    sum += zero
                    oneChecker = False

            i -= 1
            j -= 1
        
        if oneChecker:
            sum += "1"

        sum = sum[::-1]

        return sum
