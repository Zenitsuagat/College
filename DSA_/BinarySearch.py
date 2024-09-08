def binary_search(lst, target):
    low = 0
    high = len(lst) - 1
    while low <= high:
        mid = (low + high) // 2
        if lst[mid] < target:
            low = mid + 1
        elif lst[mid] > target:
            high = mid - 1
        else:
            return mid
    return -1


l = eval(input("Enter the elements : "))
tar = int(input("Enter the target : "))
result = binary_search(l, tar)
if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
