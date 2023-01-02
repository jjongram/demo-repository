s = "3people unFollowed me"
s = s.lower()
str = list(s.split())
print(str)
print(type(len(str[0])))
for i in range(len(str)):
    for j in range(len(str[i])):
        print("hi")
