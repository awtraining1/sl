"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const interface_demo_1 = require("./interface-demo");
let myArr1 = []; // in Plain JS
let myArr2 = []; // in TS
let myArr3 = []; // in TS
let myArr4 = []; // in TS
myArr4.push(new interface_demo_1.Person("Sujata"));
myArr4.push(new interface_demo_1.Person("Manoj"));
console.log(myArr4[0].name);
