
"""
Converts an integer into a strig and displays
123....n, where n is the integer from the user
"""
def convert_integer_to_string():

    string = ""

    for number in range(1, integer + 1):

        string += str(number)

    print(string)


"""
Main
"""
if __name__ == "__main__":

    integer = int(input())

    # display string
    convert_integer_to_string()