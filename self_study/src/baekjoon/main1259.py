while True:
    str = input()
    if str == '0':
        break
    for i in range(int(len(str)/2)):
        cnt = 0
        if(str[i] != str[len(str)-1-i]):
            cnt += 1
            # print("no")
        else:
            cnt += 0
            # print("yes")
    if (cnt == 0) :
        print("yes")
    else :
        print("no")