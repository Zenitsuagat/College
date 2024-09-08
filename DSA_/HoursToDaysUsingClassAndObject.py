# TEAM - 4
# HARIHARAN.M  23110020
# 1.Write a python program to convert hours into days using class and objects

class HoursToDays:
    def __init__(self,hr):
        self.hr = hr

    def convert(self):
        days = self.hr / 24
        return days


hours = int(input("Enter the value : "))
a = HoursToDays(hours)
print("Days : ",a.convert())
