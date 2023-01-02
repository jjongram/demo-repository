n = int(input())
gcd = 0
for i in range(1, min(6, n)+1, 1) :
    if(n % i == 0 and 6 % i == 0) :
        gcd = i
answer = n / gcd