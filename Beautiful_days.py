#!/bin/python3

import math
import os
import random
import re
import sys
def rev(i):
    r=0
    num=i
    while(num>0):
        rem=int(num%10)
        r=int((r*10)+rem)
        num=int(num/10)
    return r
# Complete the beautifulDays function below.
def beautifulDays(i, j, k):
    count=0
    for m in range(i,j+1):
        r=rev(m)
        diff=(m-r)/k
        if(diff.is_integer()):
            count=count+1
    return count
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ijk = input().split()

    i = int(ijk[0])

    j = int(ijk[1])

    k = int(ijk[2])

    result = beautifulDays(i, j, k)

    fptr.write(str(result) + '\n')

    fptr.close()
