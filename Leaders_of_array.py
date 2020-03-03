t=int(input())
for _ in range(t):
    n=int(input())
    ip=list(map(int,input().split()))
    r_max=ip[-1]
    leaders=[]
    for i in range(n-1,-1,-1):
        if ip[i]>=r_max:
            leaders.append(ip[i])
            r_max=ip[i]
    leaders.reverse()
    for i in leaders:
        print(i,end=" ")
    print()
