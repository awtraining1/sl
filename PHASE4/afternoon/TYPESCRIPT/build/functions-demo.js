"use strict";
/*

function f1(x,y){
    
    return x+y
 }
 */
function f1(x, y) {
    return x + y;
}
// NOTE: If we don't return anything from the function, then mention that we return void
function f2(name) {
    console.log(`My name is ${name}`);
}
//QUES: WaTF that name and return upperCase of that name
//SOLN:
function f3(name) {
    return name.toUpperCase();
}
//QUES: WaAF that take name and return upperCase of that name
// const strToUCaseInJS = (name)  =>   name.toUpperCase(); // JS
const strToUCase = (name) => name.toUpperCase(); // TS
