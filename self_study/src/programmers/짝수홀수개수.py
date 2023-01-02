num_list = [1,2,3,4,5]
answer = []
odd = 0
even = 0
for i in range(len(num_list)) :
    if(num_list[i] % 2 == 0) :
        even += 1
    else :
        odd += 1
answer.append(even)
answer.append(odd)
print(answer)