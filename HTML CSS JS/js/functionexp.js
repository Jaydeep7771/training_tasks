// console.log(cube(3));

// const cube= function(n){
//     return n*n*n;
// }
// console.log(cube(3));

// var factorial = function fac(n){
// return n<2?1:n*fac(n-1);}
// console.log(factorial(3));

var intrest=function(num1,num2,num3){
    return (num1*num2*num3)/100;
}
console.log(intrest(2,3,4));


let pi = 3.14;
      function findArea(r) {
        return (pi * r * r);
    }
    
    let r, Area;
    r = 5;
    
    Area = findArea(r);
    console.log("Area of Circle is: " + Area);

function print_table(n, i = 1) {
        if (i == 11) 
            return;
        console.log(n + " * " + i + " = " + n * i);
        i++;  
        print_table(n, i);
    }
    
    let n = 7;
    print_table(n);

function fib(n){
    if(n==0){
        return 0;

    }
    if(n==1){
        return 1;

    }

    return fib(n-1)+fib(n-2);
}      
    console.log(fib(10));

