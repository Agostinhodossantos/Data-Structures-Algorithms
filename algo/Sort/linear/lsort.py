arr = [1,2,3,5,62,24]

for i in range(0, len(arr)):
    for j in range(i + 1, len(arr)):
        if (arr[j] < arr[i]):
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp


# print(arr)


def linear_search(list, target):
    """
    Returns the index position of the target if flound, else returns None
    """
    for i in range(0, len(list)):
        if list[i] == target:
            return list[i]
    return None


def verify(index):
    if index is not None:
        print("Target found at index: ", index)
    else:
        print("Target not found in list")

numbers = [1, 2, 3, 4, 5]
result = linear_search(numbers, 4)
#verify(result)











def mybinary_s(list, target):
    first = 0
    last = len(list)

    while first <= last:
        midpoint = (first + last) // 2

        if (list[midpoint] == target):
            return midpoint
        elif(midpoint < list[i]):
            first = first + 1
        else:
            first = first - 1
    return None

verify(mybinary_s(numbers, 3))    
















def binary_search(list, target):
    first = 0
    last = len(list) - 1

    while first <= last:
        midpoint = (first + last) // 2

        if list[midpoint] == target:
            return midpoint
        elif list[midpoint] < target:
            first = midpoint + 1
        else:
            first = midpoint - 1
    return None


#verify(binary_search(numbers, 3))












