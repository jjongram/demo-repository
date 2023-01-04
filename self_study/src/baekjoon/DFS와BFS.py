from collections import deque

N, M, V = map(int, input().split())

graph = [[0] * (N+1) for _ in range(N+1)]

for i in range(M):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

visited = [False] * (N+1)

def dfs(V):
    visited[V] = True
    print(V, end=" ")
    for i in range(1, N+1):
        if not visited[i] and graph[V][i] == 1:
            dfs(i)


def bfs(V):
    print()
    visited = [False] * (N+1)
    queue = deque([V])
    while queue:
        visited[V] = True
        V = queue.popleft()
        print(V, end=" ")
        for i in range(1, N+1):
            if not visited[i] and graph[V][i] == 1:
                queue.append(i)
                visited[i] = True

dfs(V)
bfs(V)
