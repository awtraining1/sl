class Car{
    name:string;
    mileage:number;

    constructor(name:string, mileage:number ){
        this.name=name;
        this.mileage=mileage;
    }
}

let car1:Car = new Car("ford",100); // in TS

console.log(`Car 1 name is ${car1.name}`);
