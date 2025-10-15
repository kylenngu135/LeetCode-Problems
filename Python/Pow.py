class Solution:
    def myPow(self, x: float, n: int) -> float:
        
        if n == 0:
            return 1
    
        extra = 1
        m = abs(n)

        while m > 1:
            if m % 2 == 1:
                extra *= x
            
            x *= x
            m //= 2
        
        x *= extra

        if n < 0:
            x = 1.0 / x

        return x
