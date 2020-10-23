n = int(input())
for t in range(n):
    r, c = [int(x) for x in input().split()]
    grid = []
    count1 = [0] * c
    for i in range(r):
        for i, x in enumerate(input()):
            count1[i] += 1 if x == '1' else 0
    for x in count1:
        print('1' if x >= r / 2 else '0', end='')
    print()