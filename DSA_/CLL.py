#CLL-IMPLENTATION & INSERTION
class node:
    def __init__(self,data):
        self.data=data
        self.next=None
class CLL:
    def __init__(self):
        self.head=None
        self.temp=None
        self.tail=None
    def create(self,data):
        newnode =node(data)
        if self.head==None:
            self.head=newnode
            self.tail=newnode
            self.tail.next = self.head
        else:
            self.tail.next=newnode
            self.tail=newnode
            self.tail.next=self.head
    def display(self):
        self.temp=self.head
        while self.temp.next!=self.head:
            print(self.temp.data,end=' ')
            self.temp=self.temp.next
        print(self.temp.data)
        print()
    def insert_at_front(self,data):
        newnode=node(data)
        newnode.next=self.head
        self.head=newnode
        self.tail.next=self.head
    def insert_at_end(self,data):
        newnode=node(data)
        self.tail.next=newnode
        self.tail = newnode
        newnode.next=self.head
    def insert_at_mid(self,data,pos):
        newnode=node(data)
        self.temp=self.head
        i=1
        while i<pos-1:
            self.temp=self.temp.next
        newnode.next=self.temp.next
        self.temp.next=newnode

    def delete_at_front(self):
        self.head = self.head.next
        self.tail.next = self.head

    def delete_at_end(self):
        self.temp = self.head
        while self.temp.next.next != self.head:
            self.temp = self.temp.next
        self.temp.next.next = None
        self.temp.next = self.head
        self.tail = self.temp

    def delete_at_mid(self, pos):
        self.temp = self.head
        i = 1
        while i < pos - 1:
            self.temp = self.temp.next
            i += 1
        self.temp.next = self.temp.next.next



obj=CLL()
while(1):
    print("1.create 2.display 3.insert_at_front 4.insert_at_mid 5.insert_at_end 6.delete_at_front 7.delete_at_end 8.delete_at_mid 9.exit")
    choice=int(input("enter the choice"))
    if choice==1:
        data=int(input("enter the data"))
        obj.create(data)
    elif choice==2:
        obj.display()
    elif choice==3:
        data=int(input("Enter the data"))
        obj.insert_at_front(data)
    elif choice==4:
        data=int(input("enter the data"))
        pos=int(input("enter the pos"))
        obj.insert_at_mid(data,pos)
    elif choice==5:
        data=int(input("enter the data"))
        obj.insert_at_end(data)
    elif choice==6:
        obj.delete_at_front()
    elif choice==7:
        obj.delete_at_end()
    elif choice==8:
        pos = int(input("Enter position "))
        obj.delete_at_mid(pos)
    elif choice==9:
        break
    else:
        print("Invalid Choice")