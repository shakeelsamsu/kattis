n = int(input())
c = sorted([int(x) for x in input().split()])
_min = 10000000
impossible = False
for i in range(n):
    if c[i] > (i + 1):
        impossible = True
        break
    else:
        _min = min(_min, c[i] / (i + 1))
print('impossible' if impossible else _min)
