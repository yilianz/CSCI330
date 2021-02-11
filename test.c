#include <stdio.h> // file including function declarations for standard I/O​
static int sa = 10;
void fun(){
    int a =10;
  
    sa = 10;
    a += 5; 
    sa += 5; 
    printf("a = %d  sa = %d\n", a, sa);
}
void check(int a, int *b){
    a++;
    *b=*b + 2;
}

int main(){

    for (size_t i = 0; i < 20; i++)
    {
        fun();
    }
    
    int a = 4; 
    int b = 0; 
    check(a,&b);
    printf("a = %d , b = %d" , a, b);


    /*
    double a,b;
    a = 2.0/4.0/8.0;
    printf("Answer is %f  \n",a);

    double c, *d; 
    c = 4; 
    d = &c;
    d = d + 4;
    
    printf("Answer is %p  \n",d);
    //printf("Hello World from C!\n");   // prints a message with a carriage return​
    */
    return 0;   // return value of function - end of program​
}