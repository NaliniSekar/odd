# odd
#include<stdio.h>
int main()
{
int a,b,i;
printf("enter the starting and ending numbers between to find the odd series");
scanf("%d%d",&a,&b);
for(i=a;i<=b;i++)
{
if(i%2!=0)
printf("\n %d",i);
}
printf("the odd series");
return 0;
}
