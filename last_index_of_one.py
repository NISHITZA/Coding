t=int(input())
for _ in range(t):
    index=-1
    ar=list(map(int,input()))
    l=len(ar)
    for i in range(0,l):
        if(ar[i]==1):
            index=i
    print(index)
