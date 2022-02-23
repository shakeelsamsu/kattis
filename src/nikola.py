n = int(input())
MAX = 500001
fees = [0]*(n+1)
for i in range(1, n+1):
    fees[i] = int(input())
dp = {}

def jump(pos, last):
    if (pos, last) in dp: return dp[(pos, last)]
    if pos < 1 or pos > n: return MAX
    if pos == n: return fees[n]
    dp[(pos, last)] = fees[pos] + min(jump(pos+last+1, last+1), jump(pos-last,last))
    return dp[(pos, last)]

print(jump(2,1))
