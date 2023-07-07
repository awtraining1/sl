class Car{
    name:string;
    mileage:number;

    constructor(name:string, mileage:number ){
        this.name=name;
        this.mileage=mileage;
    }
}

// let car1 = new Car("Ford", 100); // in JS
let car1:Car = new Car("ford",100); // in TS