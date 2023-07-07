"use strict";
// Decl'ing primitives in TS
let a = 10;
// String decl
let myStr = "Hello";
// Array decl
let myArray1;
// Array decl and initilization 
let myArray2 = [5, 10, 20];
let myArray3 = [5, "Hello", true];
myArray3[0] = 1600;
// myArray3[0] = "6"; ERROR
myArray3.push("World"); // Fine
myArray3.push(10); // Fine
myArray3.push(false); // Fine
console.log(myArray3);
const add = (x, y) => x + y;
