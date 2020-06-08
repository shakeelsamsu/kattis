def wait(t, c):
    while c < t:
        c += c
    return c

s, t, n = [int(i) for i in raw_input().split()]
d = map(int, raw_input().split())
b = map(int, raw_input().split())
c = map(int, raw_input().split())
time = s
time += d[0]
for i in range(n):
    time = wait(time, c[i])
    time += b[i]
    time += d[i+1]
print('yes' if time < t else 'no')
