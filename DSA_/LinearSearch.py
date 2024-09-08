def linear_search(lst, target):
    for i in range(0, len(lst)):
        if lst[i] == target:
            return i

    return -1


l = list(map(int, input("Enter the element : ").split()))
ele = int(input("Enter the element to be searched : "))
result = linear_search(l, ele)
if result != -1:
    print(f"Element found at index {result}")
else:
    print("Element not found")
