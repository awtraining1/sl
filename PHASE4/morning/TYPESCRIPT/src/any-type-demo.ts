// any allows us to store any datatype, just like JS
let x3: any ; 

x3=10;
x3="Hello";


// Typecasting
 let x4: any = "10";

 let x5 = (x4 as number); // x5 is now a number.

 let x6:any = 20;
 let x7 = (x6 as string);

 console.log(x7); // 20

 //console.log(x7.toLowerCase()); // ERROR, on a number 20 we cannot invoke string functions!!

