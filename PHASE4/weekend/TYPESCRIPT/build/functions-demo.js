"use strict";
// function f1(x,y){
//     return x+y
//  }
function f1(x, y) {
    return x + y;
}
;
const arrowf1 = (x, y) => x + y;
function f2(x, y) {
    console.log(x + y);
}
;
let result = f1(4, 5);
console.log(result);
let arrow_result = arrowf1(4, 5);
console.log(arrow_result);
f2(40, 5);
