f = [0, 1, 2, -1, -1, 5, 9, -1, 8, 6]

def flip(n):
    x = 0
    while n > 0:
        a = n % 10
        if f[a] == -1: return -1
        x += 10 ** (len(str(n)) - 1) * a
        n /= 10
        #print(a, n, x)
    return x

n, s = [int(x) for x in raw_input().split()]
nums = [int(x) for x in raw_input().split()]
m = {}
for i in range(n):
    #print(i)
    if nums[i] not in m:
        m[nums[i]] = set([i])           
    else: 
        m[nums[i]].add(i)
    flipped = flip(nums[i])
    if flipped != -1 and flipped != nums[i]:
        if flipped not in m.keys():
            m[flipped] = set([i])
        else:
            m[flipped].add(i)
    nums.append(flipped)

status = False
flipped = False
for i in range(len(nums)):
    if i >= n: flipped = True
    if s-nums[i] not in m.keys(): continue
    if len(m[s-nums[i]]) > 0:
        if flipped:
            if i - n not in m[s-nums[i]] or len(m[s-nums[i]]) > 1:
                #print(i, nums[i], s-nums[i])
                status = True
                break
        else:
            if i not in m[s-nums[i]] or len(m[s-nums[i]]) > 1:
                #print(i, nums[i], s-nums[i])
                status = True
                break

print('YES' if status else 'NO')
