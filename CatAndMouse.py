import math
import os
import random
import re
import sys

# Complete the catAndMouse function below.
def catAndMouse(c1, c2, m):
   len1=0
   len2=0
   if(m>c1):
        len1=m-c1
   else:
        len1=c1-m
   if(m>c2):
        len2=m-c2
   else:
        len2=c2-m
   print(len1,len2)
   if(len1>len2):
        return 'Cat B'
   elif(len2>len1):
        return 'Cat A'
   else:
        return 'Mouse C'
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        xyz = input().split()

        x = int(xyz[0])

        y = int(xyz[1])

        z = int(xyz[2])

        result = catAndMouse(x, y, z)

        fptr.write(result + '\n')

    fptr.close()
