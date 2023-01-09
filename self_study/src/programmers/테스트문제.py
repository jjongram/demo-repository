num = 1234


def run(num):
    while True:
        if len(str(num)) % 2 == 0:
            a = str(num)[0:int(len(str(num))/2)]
            b = str(num)[int(len(str(num))/2):]
            x = 1
            y = 1
            for i in a:
                x *= int(i)

            for i in b:
                y *= int(i)

            if x == y:
                return num
            num += 1


print(run(1234))
