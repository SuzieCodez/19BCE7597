#1
n<-9
data<-c(0.593
,0.142
,0.329
,0.691
,0.231
,0.793
,0.519
,0.392
,0.418)
testedMean<-mean(data)
sd<-sd(data)
givenMean<-0.3
t<-(testedMean-givenMean)/(sd/sqrt(n))
t
pnorm(-abs(t))

if(pnorm(-abs(t))<0.05)
{
print("Mean level of salmonella in ice cream is greater than 0.3 MPN/g.")
} else{
print("Mean level of salmonella in ice cream is lesser than 0.3 MPN/g.")
}

#2
n<-10
givenMean<-75
alpha<-0.05
data<-c( 65, 78, 88, 55, 48, 95, 66, 57, 79, 81)
testedMean<-mean(data)
testedMean
sd<-sd(data)
t<-(testedMean-givenMean)/(sd/sqrt(n))
t
2*pnorm(-abs(t))

if(pnorm(-abs(t))<alpha)
{
print("There is a significant difference between the sample and population means")
}else {
print("There is no significant difference between the sample and population means")}

#3
A<-c( 175, 168, 168, 190, 156, 181, 182, 175, 174, 179)
B<-c( 185, 169, 173, 173, 188, 186, 175, 174, 179, 180)
meanA<-mean(A)
meanB<-mean(B)
sdA<-sd(A)
sdB<-sd(B)
meanA
meanB
t<-(meanA-meanB)/((sdA-sdB)/sqrt(10))
t

p<-2*pnorm(-abs(t))

if(p<0.05)
{
print("There is no significant difference")
} else{
print("There is a significant difference")}
