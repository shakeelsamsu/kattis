from math import sqrt
a, b, c, d = [float(x) for x in raw_input().split()]
s = (a+b+c+d)/2
print(sqrt((s-a)*(s-b)*(s-c)*(s-d)))
