getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-4
_____

1) Matrices and arrays:
(a)Matrices and arrays are represented as vectors with dimensions:
   Create one matrix x with 1 to 12 numbers with 3 � 4 order.
(b) Create same matrix with matrix function.
(c) Give name of rows of this matrix with A,B,C.
(d) Transpose of the matrix.
(e) Use functions cbind and rbind separately to create different matrices.
(f) Use arbitrary numbers to create matrix.
(g) Verify matrix multiplication.

Code:
______

a)
x<-(c(1:4))
y<-(c(5:8))
z<-(c(9:12))
array(c(x,y,z),dim=c(3,4,1))

b)
x=matrix(
c(1:12),
nrow=3,
ncol=4,
byrow=TRUE)	
x

c)
rownames(x)<-c("A","B","C")
rownames(x)
#colnames(x)
x

d)
t(x)

e)
x<-(c(1:4))
y<-(c(5:8))
z<-(c(9:12))
m<-cbind(x,y,z)
n<-rbind(x,y,z)
m
n

f)
arbit<-c(23,54,5,7,25,89,77,5,1,46,899,76,10,2,12,109)
v<-matrix(arbit,nrow=4,ncol=4)
v

g)
v
x
mul<-v%*%x
mul

Lab-4
______

Q.2) Random sampling
(a) In R you can simulate these situations with the sample function. Pick five numbers at random
from the set 1 : 40.

(b) Notice that the default behaviour of sample is sampling without replacement. That is the
samples will not contain the same number twice, and obviously can not be bigger than the length
of the vector to be sampled. If you want sampling with replacement, then you need to add the
argument replace = T RUE. Sampling with replacement is suitable for modelling coin tosses or
throws of a die. So, for instance, simulate 10 coin tosses.

(c) In fair coin-tossing, the probability of heads should equal the probability of tails, but the idea
of a random event is not restricted to symmetric cases. It could be equally well applied to other
cases, such as the successful outcome of a surgical procedure. Hopefully there would be a better
than 50% chance of this. Simulate data with non equal probabilities for the outcomes (say, a 90%
chance of success) by using the prob argument to sample.

(d) The choose function can be used to calculate the following expression.

40
5

=
40!
5!35! .
(e) Find 5!

Code:
______

a)
sample(c(1:40),5)

b)
sample(c("H","T"),10,replace=TRUE)

c)
sample(c("H","T"),10,replace=TRUE,prob=c(0.1,0.9))

d)
choose(40,5)

e)
factorial(5)