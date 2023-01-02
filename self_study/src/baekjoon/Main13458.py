import sys
n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b, c = map(int, sys.stdin.readline().split())
cnt = 1
for i in range(len(a)) :
    a[i] -= b

for i in range(n) :
    sum = 0
    cnt += 1
    while True :
        sum += c
        cnt += 1
        if sum >= a[i] :
            break;
print(cnt)