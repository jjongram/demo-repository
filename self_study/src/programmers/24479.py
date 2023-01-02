graph = [
    [],
    [2,4],
    [3,4],
    [2,4],
    [1,2,3],
    []
]
visited = [False] * 6

def dfs(graph, v, visited):
    visited[v] = True
    if visited[v] == True :
        print(v)
    elif visited[v] == False :
        print(0)
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

dfs(graph, 1, visited)