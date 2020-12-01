#1)
mean<-140
sd<-20
data<-c(120,115,94,118,111,102,102,131,105,107, 115,139,115,113,114,105,115,134 ,109,109,93,118,109,106,125,150,142,119,127,
141,149,144,142,149,161,143,140,148,149,141,146,159,152,135,134,161,130,125, 141,148,153,145,137,147,175)

meanData<-mean(data)

z<-(meanData-mean)/(sd/sqrt(55))
z
2*pnorm(-abs(z))
if(2*pnorm(-abs(z))<0.05)
{
print("Null Hypothesis should be rejected")
} else {
print("Null Hypothesis should not be rejected")}

#2
alpha<-0.05
n<-100
x<-43
#H0
p<-0.5
q<-0.5
#H1
sd=sqrt((q*p)/n)
sd
z<-(0.43-0.5)/(sd/sqrt(n))
z
2*pnorm(-abs(z))

if(2*pnorm(-abs(z))<alpha)
{
print("Null Hypothesis should be rejected: Coin isn't fair")
} else {
print("Null Hypothesis should not be rejected: Coint is fair")
}			

#3
n<-50
alpha<-0.01
actualMean<-8
testedMean<-7.8
sd<-0.5
z<-(testedMean-actualMean)/(sd/sqrt(n))
z
2*pnorm(-abs(z))

if(2*(pnorm(-abs(z)))<alpha){
print("Null Hypothesis should be rejected: Mean breaking strength isn't equal to 8")
} else {
print("Null Hypothesis should not be rejected: Mean breaking strength is equal to 8")
}
