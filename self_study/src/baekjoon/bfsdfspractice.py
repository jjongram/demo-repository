import sys
from collections import deque
N, M, V = map(int, sys.stdin.readline().split())

graph = [[0]*(N+1) for i in range(N+1)]

#인접행렬생성
for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

visited = [False] * (N + 1)

def dfs(V):
    visited[V] = True
    print(V, end=' ')
    for i in range(1, N+1):
        if not visited[i] and graph[V][i] == 1:
            dfs(i)

def bfs(V):
    print()
    visited = [False] * (N + 1)
    queue = deque([V])
    while queue:
        visited[V] = True
        V = queue.popleft()
        print(V, end=" ")
        for i in range(1, N+1):
            if not visited[i] and graph[V][i] == 1:
                queue.append(i)
                visited[i] = True

dfs(1)
bfs(1)
