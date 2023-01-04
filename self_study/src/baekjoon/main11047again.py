n, k = map(int, input().split())
a = []
cnt = 0
max = 0
index = []
for i in range(n) :
    a.append(int(input()))
for i in range(n) :
    if(k >= a[i]) :
        max = a[i]
        index.append(i)
for i in range(len(index)-1, -1, -1) :
    cnt += k // a[i]
    k %= a[i]
print(cnt)
