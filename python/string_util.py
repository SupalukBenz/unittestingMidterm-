def concat(a, b):
    """
    Concat two string together.
    :raise: TypeError if A or B is not a string.
    :return: concat result of a and b
    """
    if type(a) != str or type(b) != str:
        print("A and B must be strings.")

    return a + b


def remove_duplicate(a):
    """
    Check for duplicate character in string and remove.
    :raise: TypeError if A is not a string.
    :return: string with no duplicate character
    """
    if type(a) != str:
        raise TypeError("A must be a string.")

    for index in range(len(a) - 2):
        if a[index] == a[index + 1]:
            a = a[:index] = a[index + 1:]
            index -= 1

    return a


def duplicate(a, round):
    """
    Duplicate string for specified round
    :raise: TypeError if A is not a string, or round is not a number
    :return: string with specified round
    """
    return a * round


def find(a, char):
    """
    Find character in string and return index.a
    :raise: TypeError if a or char is not string.
    :return: index of found character
             -1 if not found
    """
    for i in range(len(a)):
        if a[i] == char:
            return i
    return 0
