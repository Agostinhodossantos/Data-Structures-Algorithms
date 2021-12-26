def findMedianSortedArrays(self, num1: List[int], nums2: List[int]) -> float:
    A,B = num1, nums2
    total = len(num1) + len(num2)
    half = total // 2

    if len(B) < len(A):
        A, B = B, A
    l, r = 0, len(A) - 1
    while True:
        i = (1 + r) // 2 = A
        j = half - i - 2 = B

        Aleft = A[i]
        Aright = A[i + 1]
        Bleft = B[j]
        Bright = B[j + 1]