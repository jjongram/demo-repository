# n, m = map(int, input().split(" "))
# num_list = list(map(int, input().split(" ")))
# for k in range(m) :
#     sum = 0
#     i, j = map(int, input().split(" "))
#     new = num_list[i-1:j]
#     for l in range(len(new)) : 
#         sum += new[l]
#     print(sum)
import sys
n, m = map(int, sys.stdin.readline().split())
num_list = list(map(int, sys.stdin.readline().split()))
for k in range(m) :
    sum = 0
    i, j = map(int, sys.stdin.readline().split())
    new = num_list[i-1:j]
    for l in range(len(new)) : 
        sum += new[l]
    print(sum)
