#include <stdio.h> // file including function declarations for standard I/O​

int main(){
    double a,b;
    a = 2.0/4.0/8.0;
    printf("Answer is %f  \n",a);

    double c, *d; 
    c = 4; 
    d = &c;
    d = d + 4;

    printf("Answer is %p  \n",d);
    //printf("Hello World from C!\n");   // prints a message with a carriage return​

    return 0;   // return value of function - end of program​
}