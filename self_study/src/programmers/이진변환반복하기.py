s = "01110"
# s = s.replace('0', '')
# print(s)
# print(len(s))
# print(bin(len(s))[2:])
zeroes = 0
cnt = 0
while s != '1':
    a = len(s)
    s = s.replace('0', '')  # 0빼기
    c = len(s)             # C구하기
    s = bin(c)[2:]
    cnt += 1
    zeroes += a - c

answer = []
answer.append(cnt)
answer.append(zeroes)
print(answer)
