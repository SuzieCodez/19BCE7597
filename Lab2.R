getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-2
______

Q.1) Few simple statistical measures:
(a) Enter data as 1, 2, 3 . . . , 10.
(b) Find sum of the numbers.
(c) Find Mean, median.
(d) Find sum of squares of these values.
(e) Find the value of 1n Pni=1
| xi i x� |, this is known as mean deviation about mean (MDx�).
(f) Check whether MDx� is less than or equal to standard deviation.

Code:

d<-c(1:10)
sum(d)
mean(d)
median(d)
sum(d^2)
s<-0
#NOT RUN{for(val in d)
s<-s+(val-mean(d))
s
MD=1/10*s
MD
#}
MD<=sd(d)

2)
x<-read.csv("Dataset calc.csv")
a)
length(x)
nrow(x)
b)
nrow(x)
ncol(x)
c)
names(x)
d)
head(x)
tail(x)
e)
x[1:5,1:3]
f)
x[c(1,3,5,6),c(2,4,5)]
g)
x[13,2]

3)
a)mean(x$Price)
mean(x$FloorArea)
mean(x$Rooms)
mean(x$Age)
median(x$Price)
median(x$FloorArea)
median(x$Rooms)
median(x$Age)
sd(x$Price)
sd(x$FloorArea)
sd(x$Rooms)
sd(x$Age)

b)
#length(x$CentralHeating)
for(row in 1:nrow(x)){
ans<-x[row, "CentralHeating"]
if(ans=="Yes")
{
c<-c+1
}
}
print(c)

c)
plot(x$Price,x$FloorArea)
plot(x$Price,x$Age)
plot(x$Price,x$Rooms)

d)
price=x$Price
hist(price)
floor=x$FloorArea
hist(floor)
age=x$Age
hist(age)

e)
boxplot(price, main="Price")
boxplot(floor, main="Floor Area")
boxplot(age, main="Age")

f)
par(mfrow=c(2,3))
hist(price)
hist(floor)
hist(age)
boxplot(price, main="Boxplot of Price")
boxplot(floor, main="Boxplot of Floor Area")
boxplot(age, main="Boxplot of Age")
#str(x)
    