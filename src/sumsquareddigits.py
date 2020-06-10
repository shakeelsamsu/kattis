n = int(raw_input())
for i in range(n):
    p, b, k = [int(x) for x in raw_input().split()]
    ssd = 0
    while k > 0:
        ssd += (k % b) ** 2
        k //= b
    print(str(p) + ' ' + str(ssd))
