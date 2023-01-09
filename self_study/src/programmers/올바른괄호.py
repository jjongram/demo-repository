s = "()()"
stack = []
# print(stack[-1])
stack.append('')
stack.append('')
for i in range(len(s)):
    stack.append(s[i])
    if stack[-2] == '(' and stack[-1] == ')':
        stack.pop()
        stack.pop()
# print(stack)
if len(stack) != 2:
    print(False)
else:
    print(True)
