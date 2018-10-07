"""
@author: shakeelsamsu
https://github.com/shakeelsamsu
Oct 6 18 11:07:56 PM
"""

l = int(input())
d = int(input())
x = int(input())
mintemp = d
maxtemp = 0

def digits(num):
    nums = [int(nums) for nums in str(num)]
    return sum(nums)

for i in range(l, d + 1):
    if digits(i) == x:
        if i < mintemp:
            mintemp = i
        if i > maxtemp:
            maxtemp = i

print(mintemp)
print(maxtemp)
