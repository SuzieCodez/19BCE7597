getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-1
______

Exp1:
a)Enter the data {2,5,3,7,1,9,6}
b)Find the number of elements in x
c)Find the last element of x
d)Find the minimum element of x
e)Find the maximum element ofx

Code:
x<-c(2,5,3,7,1,9,6)
length(x)
x[7]
min(x)
max(x)

Exp2:
Enter the data{1,2,...,20}
a)FInd the 3rd element in the data list.
b)Find the 3rd to 5th element in the data list
c)Find 2nd,5th,6th and 12th element.
d)Print the data as {20,19,18,...,1}


Code:
x<-c(1:20)
x[3]
x[3:5]
x[c(2,5,6,12)]
rev(x)

Exp3:
a)Create a data list (4,4,4,4,3,3,3,5,5,5)using 'rep' function.
b)Create a list(4,6,3,4,6,3,...,4,6,3) where there are 10 occurrences of 4,6,3 in the given order.
c)Create a list(4,1,5,3,2,3,4,5,7,7,7,7,7,7,6,5,4,3,2,1,34,21,54)using one line command
d)First create a list (2,1,3,4) and append this list at the end of another list (5,7,12,6,-8). Check whether the number of elements in the augmented list is 11.


Code:
x<-c(rep(4,4),rep(3,3),rep(5,3))
x
temp<-c(4,6,3)
y<-c(rep(temp,10))
y
l<-c(4,1,5,3,(2:5),rep(7,6),rev((1:6)),34,21,54)
l
a<-c(5,7,2,6,-8)
add<-c(2,1,3,4)
new<-append(a,add,after=length(a))
new
length(new)==11
