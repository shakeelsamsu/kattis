s = 0
def rec(x):
    global s
    s += x
    if x == 1: 
        return
    if x % 2 == 0:
        rec(x/2)
    else:
        rec(3*x+1)
rec(int(raw_input()))
print(s)
