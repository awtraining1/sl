"use strict";
class Car {
    constructor(name, mileage) {
        this.name = name;
        this.mileage = mileage;
    }
}
let car1 = new Car("ford", 100); // in TS
console.log(`Car 1 name is ${car1.name}`);
