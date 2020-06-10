grid = []
n = int(raw_input())
for i in range(n):
    arr = []
    s = raw_input()
    for j in range(n):
        arr.append(s[j])
    grid.append(arr)
status = True
for i in range(n):
    b = 0
    c = 0
    lastChar = ' '
    lastCount = 0
    for x in range(n):
        if grid[x][i] == 'B': b += 1
        else: c += 1
        if grid[x][i] == lastChar: lastCount += 1
        else: lastCount = 1
        lastChar = grid[x][i]
        if lastCount == 3: status = False
    if b != c: status = False
    b = 0
    c = 0
    lastChar = ' '
    lastCount = 0
    for x in range(n):
        if grid[i][x] == 'B': b += 1
        else: c += 1
        if grid[i][x] == lastChar: lastCount += 1
        else: lastCount = 1
        lastChar = grid[i][x]
        if lastCount == 3: status = False
    if b != c: status = False
    if not status: break
print(1 if status else 0)
