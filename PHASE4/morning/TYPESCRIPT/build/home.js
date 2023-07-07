"use strict";
// Decl'ing primitives in TS
let a = 10;
// String decl
let myStr = "Hello";
// Array decl
let myArray1 = [];
// myArray1.push("World"); // ERROR
myArray1.push(10); // Fine
//myArray1.push(false);  // ERROR
let myStrArray = [];
myStrArray.push("World");
class Car {
    constructor(name, age) {
        this.display = () => console.log("My name is " + this.name);
        this.getName = () => this.name;
        this.getAge = () => this.age;
        this.name = name;
        this.age = age;
    }
    ;
}
let car1 = new Car("Tata", 5);
//Question: How to decl an array of Car objects
let cars = [];
cars.push(new Car("Tata", 5));
let car2 = new Car("Toyata", 65);
cars.push(car2);
// Tuple decl and initilization 
let myArray2 = [5, 10, 20];
let myArray3 = [5, "Hello", true];
myArray3[0] = 1600;
// myArray3[0] = "6"; ERROR
myArray3.push("World"); // Fine
myArray3.push(10); // Fine
myArray3.push(false); // Fine
console.log(myArray3);
// Declaring Enums
var ModelYear;
(function (ModelYear) {
    ModelYear[ModelYear["Year2020"] = 2020] = "Year2020";
    ModelYear[ModelYear["Year2021"] = 2021] = "Year2021";
    ModelYear[ModelYear["Year2022"] = 2022] = "Year2022";
    ModelYear[ModelYear["Year2023"] = 2023] = "Year2023";
})(ModelYear || (ModelYear = {}));
class Bus {
    constructor(name, modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }
    ;
}
let bus1 = new Bus("TataBus", ModelYear.Year2023);
console.log(`Bus1 Model year  ${bus1.modelYear}`);
// Declaration of arrow function in TS
const add = (x, y) => x + y;
function f1(name) {
    return name.toUpperCase();
}
