from sys import stdin,stdout

def main():
    hwb = [int(x) for x in stdin.readline().split()]
    height = hwb[0]
    width = hwb[1]
    bricks = hwb[2]
    arr = [int(x) for x in stdin.readline().split()]
    wall = height * width
    temp = 0
    rowtemp = 0
    row = False
    htemp = 1
    if sum(arr) < wall:
        print("NO")
    else:
        for x in arr:
            if temp < wall:
                temp += arr[x]
                rowtemp += arr[x]
            if temp >= (width * htemp): #rowtemp >= width
                if rowtemp == width:
                    rowtemp = 0
                    if htemp == height:
                        break
                    htemp += 1
                else:
                    row = True
                    break
        if temp == wall and row == False:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()