class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Linkedlist:
    def __init__(self):
        self.head = None
        self.temp = None

    def create(self):
        data = int(input("Enter the data : "))
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            self.temp = newnode
        else:
            self.temp.next = newnode
            self.temp = newnode

    def display(self):
        self.temp = self.head
        while self.temp is not None:
            print(self.temp.data, end=' ')
            self.temp = self.temp.next

    def insert_at_front(self):
        data = int(input("Enter the data : "))
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode

    def insert_at_middle(self):
        data = int(input("Enter the data : "))
        newnode = Node(data)
        pos = int(input("Enter the position to be inserted : "))
        i = 1
        self.temp = self.head
        for i in range(1, pos-1):
            if self.temp.next is None:
                print("Position out of bounds")
                return
            self.temp = self.temp.next
        newnode.next = self.temp.next
        self.temp.next = newnode

    def insert_at_end(self):
        data = int(input("Enter the data : "))
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            self.temp = newnode
        else:
            self.temp = self.head
            while self.temp.next is not None:
                self.temp = self.temp.next
            self.temp.next = newnode

    def delete_at_front(self):
        if self.head is None:
            print("List is Empty")
            return
        self.head = self.head.next
        print("Node deleted from the front")

    def delete_at_middle(self):
        if self.head is None:
            print("List is empty")
            return
        self.temp = self.head
        pos = int(input("Enter the position to be deleted : "))
        for i in range(1, pos-1):
            if self.temp.next is None:
                print("Position out of bounds")
                return
            self.temp = self.temp.next
        self.temp.next = self.temp.next.next
        print("Node deleted from the middle")

    def delete_at_end(self):
        if self.head is None:
            print("list is empty")
            return
        if self.head.next is None:
            self.head = None
            print("Node deleted at the end")
            return
        self.temp = self.head
        while self.temp.next.next is not None:
            self.temp = self.temp.next
        self.temp.next = None
        print("Node deleted from the end")


o = Linkedlist()
while True:
    print("""\n
    1.Create
    2.Display
    3.Insert at Front
    4.Insert at Middle
    5.Insert at End
    6.Delete at Front
    7.Delete at Middle
    8.Delete at End
    9.Exit""")
    c = int(input("Enter your choice : "))
    if c == 1:
        o.create()
    elif c == 2:
        o.display()
    elif c == 3:
        o.insert_at_front()
    elif c == 4:
        o.insert_at_middle()
    elif c == 5:
        o.insert_at_end()
    elif c == 6:
        o.delete_at_front()
    elif c == 7:
        o.delete_at_middle()
    elif c == 8:
        o.delete_at_end()
    elif c == 9:
        break
    else:
        print("Invalid Input")
