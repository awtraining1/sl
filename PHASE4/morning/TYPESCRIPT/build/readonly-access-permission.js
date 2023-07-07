"use strict";
class Bike {
    constructor(name, age, mileage) {
        this.name = name;
        this.age = age;
        this.mileage = mileage;
    }
    ;
}
let bike1 = new Bike("Bajaj", 45, 100);
bike1.name; // Fine
bike1.name = "Hyundai"; // Fine 
bike1.age; // Fine
// bike1.age = 80 ; // ERROR age is readonly
//bike1.mileage; // ERROR mileage is private
// Other access specifiers public and protected
