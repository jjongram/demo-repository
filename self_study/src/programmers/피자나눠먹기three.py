n = int(input())
slice = int(input())
answer = 0
cnt = 0
while(cnt < n) :
    cnt += slice
    answer += 1
print(answer)