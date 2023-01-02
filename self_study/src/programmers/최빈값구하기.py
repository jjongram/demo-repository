array = [1, 2, 3, 3, 3, 4, 4]
array.sort()
# print(array)
answer = 0
s = set(array)
arr = list(s)
strarr = []
for i in range(len(arr)):
    cnt = 0
    str1 = ''
    for j in range(len(array)):
        if arr[i] == array[j]:
            cnt += 1
            str1 += str(array[j])
    strarr.append(str1)
# print(strarr)
strarr.sort(reverse=True)
print(strarr)
answer = strarr[0]
temp = []
for i in range(len(arr)):
    temp.append(array.count(arr[i]))
if temp.count(max(temp)) != 1:
    answer = -1
print(answer)
