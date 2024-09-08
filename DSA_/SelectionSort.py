def selection_sort(lst):
    for i in range(0, len(lst)):
        min = i
        for j in range(i+1, len(lst)):
            if lst[min] > lst[j]:
                min = j
        if min != i:
            lst[i], lst[min] = lst[min], lst[i]


l = list(map(int, input("Enter the element : ").split()))
selection_sort(l)
print(l)
