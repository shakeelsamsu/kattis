x, y = [float(x) for x in input().split()]
if y == 1:
    if x == 0: print('ALL GOOD')
    else: print('IMPOSSIBLE')
else:
    print(-x/(y-1))