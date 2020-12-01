getwd()
setwd("C:/Users/asus/Desktop/Lab 3rd Sem(ONL)/MAT1011/R")

Lab-5
______

1)
Five terminals on an on-line computer system are attached to a communication line to the
central computer system. The probability that any terminal is ready to transmit is 0.95. Let X
denote the number of ready terminals.
(a) Find the probability of getting exactly 3 ready terminals.
(b) Find all the probabilities.

Code:

a)
dbinom(x=3,size=5,prob=0.95)

b)
x<-0:5
dbinom(x,size=5,prob=0.95)

2)
It is known that 20% of integrated circuit chips on a production line are defective. To maintain
and monitor the quality of the chips, a sample of twenty chips is selected at regular intervals for
inspection. Let X denote the number of defectives found in the sample. Find the probability of
different number of defective found in the sample?

Code:

dbinom(x,size=20,prob=0.2)

3)
It is known that 1% of bits transmitted through a digital transmission are received in error.
One hundred bits are transmitted each day. Find the probability of different number of bits found
in error each day.?

Code:

dbinom(x,size=100,prob=0.01)

4)
Plot all of the above problems in a single window for random variable and respective Probability
distribution.

Code:

par(mfrow=c(2,2))
x<-0:5
plot(x,dbinom(x,size=5,prob=0.95))
x<-0:20
plot(x,dbinom(x,size=20,prob=0.2))
x<-0:100
plot(x,dbinom(x,size=100,prob=0.01))

5)
For Q.No. 1 Find P(X = 3) and P(X > 3).
For Q. No. 2 Find P(X = 4) and P(X > 4).
Find all the cumulative probabilities and round to 4 decimal places.

Code:

a)
P<=3
pbinom(3,size=5,prob=0.95)

P>3
1-pbinom(3,size=5,prob=0.95)

b)
P<=4
pbinom(4,size=20,prob=0.2)
P>4
1-pbinom(4,size=20,prob=0.2)

c)
x<-0:20
round((pbinom(x,size=20,prob=0.2)),4)

6)
The probability that a patient recover from a rare blood disease is 0.4. If 15 people are known
to have contracted this disease, what is the probability that
(a) at least 10 survive,
(b) from 3 to 8 survive,
(c) exactly 5 survive?

Code:

a)
x<-0:10
dbinom(x,size=15,prob=0.4)

b)
x<-3:8
dbinom(x,size=15,prob=0.4)

c)
dbinom(x=5,size=15,prob=0.4)