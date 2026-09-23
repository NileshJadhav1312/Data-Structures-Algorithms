class Solution:
    def isPalindrome(self, x: int) -> bool:
        x2=abs(x)
        revnum=0
        while(x2>0):
            rem=x2%10
            revnum=(revnum*10)+rem
            x2=x2//10

        if x==revnum:
            return True
        else:
            return False