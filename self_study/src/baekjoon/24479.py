import sys
N, M, R = map(int, sys.stdin.readline().split())

graph = [[0]*(N+1) for _ in range(N+1)]

for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

visited = [False] * (N+1)

order = [0] * N

def dfs(R):
    visited[R] = True
    # print(R)
    for i in range(1, N+1):
        if not visited[i] and graph[R][i] == 1:
            order[R] = i
            dfs(i)


dfs(R)
order[R-1] = 1
print(order)


# for i in range(len(order)):
#     order[i] = 
