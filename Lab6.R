getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-6
______

1)
During a laboratory experiment, the average number of radioactive particles passing through
a counter in 1 millisecond is 4. What is the probability that 6 particles enter the counter in a given
millisecond?

Code:
dpois(x=6,lambda=4)

2)
In a certain industrial facility, accidents occur infrequently. It is known that the probability
of an accident on any given day is 0.005 and accidents are independent of each other.
(a) What is the probability that in any given period of 400 days there will be an accident on one
day?
(b) What is the probability that there are at most three days with an accident?

Code:
l<-400*0.005
dpois(1,l)
ppois(3,l)

3)
In a manufacturing process where glass products are made, defects or bubbles occur, occasionally
rendering the piece undesirable for marketing. It is known that, on average, 1 in every 1000 of
these items produced has one or more bubbles. What is the probability that a random sample of
8000 will yield fewer than 7 items possessing bubbles?

Code:

l<-8000*1/1000
ppois(6,l)


4)
On average, 3 traffic accidents per month occur at a certain intersection. What is the
probability that in any given month at this intersection
(a) exactly 5 accidents will occur?
(b) fewer than 3 accidents will occur?
(c) at least 2 accidents will occur?

Code:
F<-
a)
dpois(5,3)
b)
ppois(2,3)
c)
1-(dpois(0,3)+dpois(1,3))

5)
The potential buyer of a particular engine requires (among other things) that the engine start
successfully 10 consecutive times. Suppose the probability of a successful start is 0.990. Let us
assume that the outcomes of attempted starts are independent.
(a) What is the probability that the engine is accepted after only 10 starts?
(b) What is the probability that 12 attempted starts are made during the acceptance process?

Code:

p<-0.990
q<-1-p
n<-10
dbinom(10,n,p)
dbinom(2,12,q)
dbinom(1,12,q)*dbinom(1,12,q)*dbinom(10,n,p)

6)                  Geometric Distribution
The acceptance scheme for purchasing lots containing a large number of batteries is to test
no more than 75 randomly selected batteries and to reject a lot if a single battery fails. Suppose
the probability of a failure is 0.001.
(a) What is the probability that a lot is accepted?
(b) What is the probability that a lot is rejected on the 20th test?
(c) What is the probability that it is rejected in 10 or fewer trials?

Code:

q<-0.001
n<-75
a)
1-pgeom(n,q,lower.tail=TRUE)
b)
dgeom(20,q)
c)
pgeom(10,q)

7)
Plot the graph for Q. No. 2, 4, 5 and 6 for Random Variable against Probability Distribution
function.

Graph for Question:
#2
x <- 0 : 400

plot(x,dpois(x,lambda <- 0.005*400) , type = "l", main="Q2")

#4

y<-0:3

plot(y,dpois(y,lambda <- 3) , type = "l",main="Q4")

#5

z<-0:10

plot(z,dbinom(z,10,0.990),type = "l",main="Q5")

#6

p<-0:75

plot(p,dbinom(p,size=75,.999),type = "l",main="Q6")

