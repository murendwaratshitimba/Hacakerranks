"""
Hackerrank problem #4: Division Types
"""


"""
Perfom integer divison and display the quotient.
"""
def integer_division():

   print(first_integer // second_integer)


"""
Perform float division and display the quotient.
"""
def float_division():

    print(first_integer / second_integer)


"""
Main
"""
if __name__ == "__main__":

    first_integer = int(input())
    second_integer = int(input())

    # floor division results
    integer_division()

    # float division results
    float_division()