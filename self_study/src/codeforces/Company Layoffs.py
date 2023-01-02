import sys
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(m):
    q = list(int(sys.stdin.readline()))
for j in range(n) :
    if(arr[j] > q) :
        arr[j] = q
print(sum(arr))
