"""
Hackerrank problem #6: Leap Year
"""

"""
Idetify Leap years
"""
def is_leap():

    leap = False

    if (year % 4 == 0  and year % 100 != 0) or year % 400 == 0:

        leap = True
    
    return leap


"""
Main
"""
if __name__ == "__main__":

    year = int(input())
    print(is_leap())