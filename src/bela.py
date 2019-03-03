from sys import stdin, stdout  

d = {'A': 11, 'K': 4, 'Q': 3, 'J': 20, 'T': 10, '9': 14, '8': 0, '7': 0}
nd = {'A': 11, 'K': 4, 'Q': 3, 'J': 2, 'T': 10, '9': 0, '8': 0, '7': 0}

def main():
    n, b = stdin.readline().split()
    n = int(n)
    sum = 0
    for i in range(n * 4):
        c = stdin.readline()
        s = c[1:]
        c = c[:1]
        if(s[0] == b[0]):
            sum += d[c]
        else:
            sum += nd[c]
    stdout.write("%s" % sum)

if __name__ == "__main__":
   main() 