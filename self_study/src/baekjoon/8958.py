import sys
from collections import deque
N = int(sys.stdin.readline().strip())

for i in range(N):
    str = sys.stdin.readline().strip()
    arr = str.split('X')
    a = arr.count('')
    for _ in range(a):
        arr.remove('')
    score = 0
    for i in range(len(arr)):
        score += (len(arr[i])+1) * (len(arr[i])) / 2
    print(int(score))
