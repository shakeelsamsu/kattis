n, p, k = [int(x) for x in raw_input().split()]
y = [int(x) for x in raw_input().split()]
s = 0
m = 1.0
ans = 0
for t in y:
    ans += m * (t - s)
    s = t
    m += p / 100.0
ans += m * (k - s)
print("{:.6f}".format(ans))
