lottos = [0, 0, 0, 0, 0, 0]
win_nums = [31, 10, 45, 1, 6, 19]
match = 0
rank = 0
zeroes = 0
for i in range(len(lottos)):
    if lottos[i] == 0:
        zeroes += 1
for i in range(len(lottos)):
    for j in range(len(win_nums)):
        if lottos[i] == win_nums[j]:
            match += 1
answer = []
if match <= 1:
    rank = 6
else:
    rank = 7 - match
print(rank)
if zeroes == 6 :
    answer.append(1)
else :
    answer.append(rank-zeroes)
answer.append(rank)
print(answer)
