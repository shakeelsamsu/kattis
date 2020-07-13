n = int(raw_input())
s = [0] * n
b = [0] * n
diffs = []
for i in range(n):
    s[i], b[i] = [int(x) for x in raw_input().split()]
diff = 10e10
for i in range(1, 2 ** n):
    p = str(bin(i)).lstrip("0b").zfill(n)
    st = 1
    bt = 0
    for j, x in enumerate(p):
        if x == '1':
            st *= s[j]
            bt += b[j]
    diff = min(abs(st - bt), diff)
print(diff)
