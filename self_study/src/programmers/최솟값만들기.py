A = [1, 2]
B = [4, 3]
A.sort()
B.sort()
B.reverse()
answer = 0
for i in range(len(A)):
    answer += A[i] * B[i]
print(answer)
