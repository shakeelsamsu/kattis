n, k = map(int, input().split())
p = [int(x) for x in input().split()]
dp = [-k]
for i in range(1, len(p)):
    dp.append(max(p[i - 1] * 100 - 2*k - 100*p[i], dp[i - 1] - k + 100*p[i - 1]- 100*p[i]))
print(0 if max(dp) < 0 else max(dp))