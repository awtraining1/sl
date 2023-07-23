"use strict";
class Bus {
    constructor(name, mileage, age, engineType) {
        this.showMileage = () => this.mileage;
        this.name = name;
        this.mileage = mileage;
        this.age = age;
        this.engineType = engineType;
    }
}
let bus3 = new Bus("ford", 100, 90, "petrol"); // in TS
// console.log(bus3.mileage); // TS error because mileage is private in class Bus.
console.log(bus3.engineType); // WORKs
// bus3.engineType="GAS"; // ERROR readonly property cannot be modified
bus3.name; // name is public, so fine to access here
bus3.name = "Toyata";
bus3.showMileage(); // Fine
