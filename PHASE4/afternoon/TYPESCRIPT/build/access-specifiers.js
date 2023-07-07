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
console.log(`Bus3 engine Type is ${bus3.engineType}`);
// bus3.engineType = "Electric"; // ERROR  because engineType is readonly
bus3.name; // name is public, so fine to access here
bus3.name = "Toyata";
// bus3.mileage; // ERROR mileage is private
bus3.showMileage(); // Fine
// age is protected, so not accessible here;
// bus3.age; // ERROR
