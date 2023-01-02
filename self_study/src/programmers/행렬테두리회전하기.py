rows = 6
columns = 6
queries = [[2, 2, 5, 4], [3, 3, 6, 6], [5, 1, 6, 3]]
cnt = 0
for i in range(len(queries)) :
    for j in range((queries[i][2]-queries[i][0] + 1) * (queries[i][3]-queries[i][1]+1) - (queries[i][2]-queries[i][0]) * (queries[i][3]-queries[i][1])) :
        cnt += 1

print(cnt)