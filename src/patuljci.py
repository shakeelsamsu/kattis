import itertools
import sys

d = [int(x) for x in sys.stdin.read().split("\n")[:-1]]

p = list(itertools.combinations(d, 7))
res = []
for q in p:
    if sum(q) == 100:
        res = q
        break
for x in q:
    print(x)
