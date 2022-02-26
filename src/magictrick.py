line = input()
print(1 if len(line) == len(set(line)) else 0)
