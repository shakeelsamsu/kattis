def left(grid):
    for i in range(4):
        arr = [x for x in grid[i] if x != 0]
        for j in range(len(arr)-1):
            if(arr[j]==arr[j+1]):
                arr[j] *= 2
                for k in range(j+1,len(arr)-1):
                    arr[k] = arr[k+1]
                arr[len(arr)-1] = 0
            #print(i,j,arr)
        while len(arr) < 4:
            arr.append(0)
        grid[i] = arr
        #print(arr)
    return grid

def up(grid):
    for i in range(4):
        arr = [row[i] for row in grid if row[i] != 0]
        for j in range(len(arr) - 1):
            if(arr[j]==arr[j+1]):
                arr[j] *= 2
                for k in range(j+1,len(arr)-1):
                    arr[k] = arr[k+1]
                arr[len(arr)-1] = 0
            #print(i,j,arr)
        while len(arr) < 4:
            arr.append(0)
        for j in range(4):
            grid[j][i] = arr[j]
        #print(arr)
    return grid

def right(grid):
    for i in range(4):
        arr = [x for x in grid[i] if x != 0]
        for j in range(len(arr)-1, 0, -1):
            if(arr[j]==arr[j-1]):
                arr[j] *= 2
                for k in range(j-1, 0, -1):
                    arr[k] = arr[k-1]
                arr[0] = 0
            #print(i,j,arr)
        while len(arr) < 4:
            arr.insert(0, 0)
        grid[i] = arr
        #print(arr)
    return grid

def down(grid):
    for i in range(4):
        arr = [row[i] for row in grid if row[i] != 0]
        for j in range(len(arr)-1, 0, -1):
            if(arr[j]==arr[j-1]):
                arr[j] *= 2
                for k in range(j-1, 0, -1):
                    arr[k]=arr[k-1]
                arr[0] = 0
            #print(i,j,arr)
        while len(arr) < 4:
            arr.insert(0, 0)
        for j in range(4):
            grid[j][i] = arr[j]
        #print(arr)
    return grid


grid = []
for i in range(4):
    grid.append(map(int,raw_input().split()))
#print(grid)
n = int(raw_input())
switch = {0:left,1:up,2:right,3:down}
switch[n](grid)
for row in grid:
    print(' '.join(list(map(str,row))))
