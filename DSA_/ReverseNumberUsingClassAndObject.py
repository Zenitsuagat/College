# TEAM - 4
# HARIHARAN.M  23110020
# 2.Write a python program to create a class for reversing an integer

class IntegerReverse:
    def __init__(self, number):
        self.number = number

    def reverse(self):
        temp = self.number
        rev = 0
        while temp != 0:
            rem = temp % 10
            rev = rev * 10 + rem
            temp = temp // 10
        return rev


n = int(input("Enter the number : "))
r = IntegerReverse(n)
print("Reversed Number : ",r.reverse())
