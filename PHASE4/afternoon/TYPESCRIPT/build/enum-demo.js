"use strict";
var ModelYear;
(function (ModelYear) {
    ModelYear[ModelYear["ModelYear2021"] = 2021] = "ModelYear2021";
    ModelYear[ModelYear["ModelYear2022"] = 2022] = "ModelYear2022";
    ModelYear[ModelYear["ModelYear2023"] = 2023] = "ModelYear2023";
    ModelYear[ModelYear["ModelYear2024"] = 2024] = "ModelYear2024";
})(ModelYear || (ModelYear = {}));
console.log(ModelYear.ModelYear2023);
class Bike {
    constructor(name, mileage, modelYr) {
        this.name = name;
        this.mileage = mileage;
        this.modelYr = modelYr;
    }
}
let bike1 = new Bike("Bullet", 100, ModelYear.ModelYear2023);
