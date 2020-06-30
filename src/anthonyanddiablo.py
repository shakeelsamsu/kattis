import math
a, n = [float(x) for x in raw_input().split()]
print('Diablo is Happy!' if 2 * math.pi * math.sqrt(a/math.pi) <= n else 'Need more materials!')
