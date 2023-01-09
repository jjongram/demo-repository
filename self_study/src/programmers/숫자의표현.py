n = 4
x = 0
while x*(x+1)/2 <= n:
    x += 1
print(x)
list = []
for i in range(x, 0, -1):
    print(int(i*(i+1)/2))
    list.append(n % int(i*(i+1)/2))
print(list)
answer = 0
for i in range(len(list), 0, -1):
    print(i)
    if list[i-1] % i == 0:
        answer += 1
print(answer)
