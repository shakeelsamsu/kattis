from sys import stdin, stdout
import math

def main():
    n = int(input())
    for line in range(n):
        x = int(input())
        print(math.ceil(x / 400))
        
if __name__ == "__main__":
    main()
