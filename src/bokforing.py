n, q = [int(x) for x in input().split()]
m = [[0, 0]] * n # [price, index]
c = [-1, 0]
for i in range(q):
    x = input().split()
    s = x[0]
    if s == 'SET':
        m[int(x[1]) - 1] = [i, int(x[2])]
    elif s == 'PRINT':
        a = int(x[1]) - 1
        if m[a][0] > c[0]:
            print(m[a][1])
        else:
            print(c[1])
    elif s == 'RESTART':
        c = [i, int(x[1])]