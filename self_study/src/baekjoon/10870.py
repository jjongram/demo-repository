n = int(input())

def fibonacci(n) :
    if n == 10 :
        return
    else :
        return fibonacci(n-1) + fibonacci(n-2)
    
print(fibonacci(n))