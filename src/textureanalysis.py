t = 1
while True:
    line = input()
    if line == 'END': break
    counts = []
    last = ''
    count = 0
    for s in line:
        if s == '.':
            count += 1
        elif s == '*':
            if last != '': counts.append(count)
            count = 0
        last = s
    print(str(t) + ' ' + ('EVEN' if len(counts) == 0 or len(counts) > 0 and min(counts) == max(counts) else 'NOT EVEN'))
    t += 1