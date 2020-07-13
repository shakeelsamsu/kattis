import itertools

def sieve():
    primes = [True] * int(10e6)
    primes[0] = primes[1] = False
    i = 2
    while i * i < 10e6:
        if primes[i]:
            for j in range(i * i, int(10e6), i):
                primes[j] = False
        i += 1
    return primes

n = int(raw_input())
primes = sieve()

for t in range(n):
    x = raw_input()
    p = []
    for l in range(1, len(x)+1):
        p += list(itertools.permutations(x, l))
    nums = set(int(''.join(x)) for x in p)
    count = 0
    for i in nums:
        if primes[i]:
            count += 1
    print(count)
