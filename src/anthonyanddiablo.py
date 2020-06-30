import math
a, n = [float(x) for x in raw_input().split()]
r = math.sqrt(a/math.pi)
print('Diablo is Happy!' if 2 * math.pi * r <= n else 'Need more materials!')
