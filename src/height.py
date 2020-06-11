n = int(raw_input())
for c in range(1, n+1):
    arr = [int(x) for x in raw_input().split()][1:]
    count = 0
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > temp:
            arr[j + 1] = arr[j]
            j -= 1
            count += 1
        arr[j + 1] = temp
    print('{} {}'.format(c, count))

