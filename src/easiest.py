from sys import stdin, stdout  

def sumDigits(n):
    n = int(n)
    sum = 0
    while n:
        sum += n % 10
        n //= 10
    return sum

def main():
    n = -1
    while True:
        n = int(stdin.readline())
        if n == 0:
            break
        status = False
        p = 10
        check = sumDigits(n)
        while not status:
            p += 1
            x = sumDigits(p * n)
            if(x == check):
                status = True
        stdout.write("%s" % p + "\n")

if __name__ == "__main__":
   main()
 