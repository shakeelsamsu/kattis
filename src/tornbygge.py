n = int(raw_input())
x = [int(x) for x in raw_input().split()]
s = 1
for i in range(1, n):
    if x[i] > x[i-1]: s += 1
print(s)