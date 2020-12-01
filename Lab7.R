Lab-7

1)IQ is a normal distribution of mean of 100 and standard deviation of 15
(a) What percentage of people have an IQ < 125?
(b) What percentage of people have an IQ > 110?
(c) What percentage of people have 110 < IQ < 125?
(d) Find 25% for standard normal distribution, mean=0, sd=1.
(e) Find 25% normal distribution with mean and standard deviation 2& 3.
(f) What IQ separates the lower 25% from the others?
(g) What IQ separates the top 25% from the others?
(h) Find 25 percentile for mean 100 and SD 15.

Code:

a) pnorm(125,100,15)*100
b)(1-pnorm(110,100,15))*100
c) 100*(pnorm(125,100,15)-pnorm(110,100,15))
d) qnorm(0.25)
e) qnorm(0.25,2,3)
f) qnorm(0.25,100,15)
g) qnorm(0.25,100,15,lower.tail=FALSE)
h) qnorm(0.25,100,15)

2)
Generate the 20 random number for a normal distribution with mean 572 and SD is 51.
Calculate mean and SD of data set

r <-rnorm(20,mean=572,sd=51)
mean(r)
sd(r)

3)
Make appropriate histogram of data in above question and visually assume if normal density
curve & histogram density estimates are similar.

std<-sd(r)
m <-mean(r)
hist(r, xlab="Data from Normal Distribution", freq = FALSE, main="Histogram with Normal Curve and Smoothed Curve")

curve(dnorm(x, mean=m, sd=std), col="blue", lwd=2, add=TRUE)

lines(density(r,adjust=1),col = "red", lwd=2)

