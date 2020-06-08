import sys

def shift(c, k):
    if(c+k < ord('A')):
        return ord('Z')+1-(ord('A')-(c+k))
    if(c+k > ord('Z')):
        return ord('A')-1+((c+k)-ord('Z'))
    return c+k

c = raw_input()
k = raw_input()
for i in range(len(k)):
    sys.stdout.write(chr(shift(ord(c[i]), -(ord('A')-ord(k[i])) if i % 2 == 1 else ord('A')-ord(k[i]))))
