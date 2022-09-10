"""
Hackerrank problem #3: Arithmetic Operators
"""


"""
Display the sum of the Two numbers provided by the user
"""
def sum ():

    print(first_integer + second_integer)


"""
Display the Difference between the two numbers provided by the user.
"""
def difference():

    print(first_integer - second_integer)


"""
Display the product of the two numbers provided by the user
"""
def product():

    print(first_integer*second_integer)


"""
Main
"""
if __name__ == "__main__":

    first_integer = int(input())
    second_integer = int(input())

    # sum of the two numbers
    sum()

    # difference of the two numbers
    difference()

    # product of the two numbers
    product()