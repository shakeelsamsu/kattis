import math
while True:
    r, h, s = [float(x) for x in raw_input().split()]
    if r == h == s == 0:
        break
    angle = math.acos(r/h)
    length = (2 * math.pi - 2 * angle) * r + 2 * math.sqrt(h ** 2 - r ** 2)
    print('{0:.2f}'.format(length * (1 + s / 100)))
