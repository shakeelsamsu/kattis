import sys

inp = sys.stdin.read().split('\n')[:-1]

for i in range(len(inp)):
    e, m = [int(x) for x in inp[i].split(" ")]
    x = 0
    while not (e % 365 == 0 and m % 687 == 0):
        e += 1
        m += 1
        x += 1
    print('Case ' + str(i+1) + ': ' + str(x))
