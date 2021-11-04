def binary_search(arr, low, high, x):

    # Check base case
    if high >= low:
        
        mid = (high + low) // 2

        # If element is present at the middle itself
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binary_search(arr, low, mid - 1, x)
        else:
            return binary_search(arr, mid + 1, high, x)
    else:
        return -1

    