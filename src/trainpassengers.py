c, n = [int(x) for x in raw_input().split()]
t = 0
status = True
for i in range(n):
    l, e, s = [int(x) for x in raw_input().split()]
    t -= l
    if t < 0:
        status = False
        break
    t += e
    if t > c:
        status = False
        break
    if t < c and s > 0:
        status = False
        break
if t > 0 or s > 0: status = False
print('possible' if status else 'impossible')
