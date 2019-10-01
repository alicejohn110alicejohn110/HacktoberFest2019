#include<stdio.h>

int sum(int, int);

int main(){
	printf("SUM : %d ", sum(10,20));
	return 0;
}

int sum(int a, int b){
	return a+b;
}