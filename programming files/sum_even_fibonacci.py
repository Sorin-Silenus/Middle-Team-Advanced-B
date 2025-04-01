# Initiate a and b and sum
a, b = 0, 1
sum_even = 0
# while b is less than 4 million check if even and add to sum
while b < 4000000:
    if b % 2 == 0:
        sum_even += b
    a, b = b, a+b
# print even sum
print(sum_even)

# answer should be 4613732
