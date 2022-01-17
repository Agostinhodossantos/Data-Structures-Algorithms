arr = [1,2,3,5,62,24]

for i in range(0, len(arr)):
    for j in range(i + 1, len(arr)):
        if (arr[j] < arr[i]):
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp


print(arr)