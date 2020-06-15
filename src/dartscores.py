from math import hypot
t = int(raw_input())
for i in range(t):
    n = int(raw_input())
    s = 0
    for j in range(n):
        x, y = [int(x) for x in raw_input().split()]
        h = hypot(x,y)
        r = 20
        while r < h and r <= 200:
            r += 20
        if r <= 200:
            s += 11 - (r / 20)
    print(s)
