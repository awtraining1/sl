"use strict";
var ModelYear;
(function (ModelYear) {
    ModelYear[ModelYear["Year2020"] = 2015] = "Year2020";
    ModelYear[ModelYear["Year2021"] = 2016] = "Year2021";
    ModelYear[ModelYear["Year2022"] = 2017] = "Year2022";
    ModelYear[ModelYear["Year2023"] = 2018] = "Year2023";
})(ModelYear || (ModelYear = {}));
class Bike {
    constructor(name, mileage, modelYr) {
        this.name = name;
        this.mileage = mileage;
        this.modelYr = modelYr;
    }
}
let bike1 = new Bike("Bullet", 100, ModelYear.Year2023);
console.log(`Bike 1 model is ${bike1.modelYr}`);
