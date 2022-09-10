"""
Hackerank problem #2: If Else
"""


"""
Process the integer and display either Weird or Not Werird string
"""
def process(integer):

    if (integer % 2 == 0 and (2 <= integer <= 5 or integer > 20)):

        print("Not Weird")

    else:

        print("Weird")


"""
Main
"""
if __name__ == "__main__":

    integer = int(input().strip())
    process(integer)