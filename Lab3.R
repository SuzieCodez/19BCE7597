getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-3
______

1)
REPEATED QUESTION

2)
(a) Print all numbers starting with 3 and ending with 7 with an increment of 0 : 0.5. Store
these numbers in x.
(b) Print all even numbers between 2 and 14 (both inclusive).
(c) Type 2 * x and see what you get. Each element of x is multiplied by 2.

Code:
a)
i<-0
x<-c()
while(i<=1000){
temp<-i
while(temp>=10)
{
temp<-temp%/%10
}	
if(i%%10==7 && temp==3)
{
print(i)
x<-c(x,i)
}
i=i+0.5
}
x

b)
i<-2
while(i<=14)
{
if(x%%2==0)
{
print(i)
}
i<-i+1
}

c)
2*x

3)
x<-read.csv("marks data.csv")
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
x[c(1,3,5,6),c(2,4)]
g)
x[13,2]

4)
a)mean(x$Maths)
median(x$Maths)
sd(x$Maths)

d)
matHist=x$Maths
hist(matHist)
phyHist=x$Physics
hist(phyHist)
chemHist=x$Chemistry
hist(chemHist)

e)

matPlot=x$Maths
boxplot(matPlot)
phyPlot=x$Physics
boxplot(phyPlot)
chemPlot=x$Chemistry
boxplot(chemPlot)

f)
par(mfrow=c(2,3))
hist(matHist)
hist(phyHist)
hist(chemHist)
boxplot(matPlot, main="Boxplot of Maths")
boxplot(phyPlot, main="Boxplot of Physics")
boxplot(chemPlot, main="Boxplot of Chemistry")


