n, m = map(int, input().split())
w = list(reversed(sorted([int(x) for x in input().split()])))
mongers = []
for i in range(m):
    x, j = map(int, input().split())
    mongers.append((x, j))
mongers = sorted(mongers, key=lambda x: x[1], reverse=True)

res = 0
p = 0
for monger in mongers:
    num_fish, price = monger
    while p < len(w) and num_fish > 0:
        res += w[p] * price
        p += 1
        num_fish -= 1
print(res)
