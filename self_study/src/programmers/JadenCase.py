s = "    3people      unFollowed Me                     "
s = s.split(' ')
answer = ""
for i in range(len(s)):
    s[i] = s[i].capitalize()
answer = " ".join(s)
print(answer)
