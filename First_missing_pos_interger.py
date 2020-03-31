class Solution:
    # @param A : list of integers
    # @return an integer
    def firstMissingPositive(self, A):
        A.sort()
        n = len(A)
        i = 0
        j = 1
        while (i<n):
            if A[i]<=0:
                i+=1
                continue
            if A[i] != j:
                return j
            elif i == n - 1:
                return j + 1 
            else:
                i += 1
                j += 1
                
        return 1
