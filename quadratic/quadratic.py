# The standard form of a quadratic equation is ax**2 + bx + c = 0

# Import module to handle operations involving complex numbers
import cmath

# Take input from user
a = int(input('Enter "a" in ax**2 + bx + c = 0 : '))
b = int(input('Enter "b" in ax**2 + bx + c = 0 : '))
c = int(input('Enter "c" in ax**2 + bx + c = 0 : '))

# Formula for finding roots
# a = (-b ± √d) / 2a
# where d is discriminant given by
# d = (b**2 - 4ac)

d = (b**2) - 4*a*c

# 2 solutions
x1 = (-b + cmath.sqrt(d)) / (2*a)
x2 = (-b - cmath.sqrt(d)) / (2*a)

print("The solutions of the Quadratic Equation are: ",x1,'and',x2)