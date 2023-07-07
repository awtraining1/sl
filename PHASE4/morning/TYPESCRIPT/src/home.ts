// Decl'ing primitives in TS
let a: number = 10;

// String decl
let myStr: string = "Hello";

// Array decl
let myArray1: number[] = [];
// myArray1.push("World"); // ERROR
myArray1.push(10);  // Fine
//myArray1.push(false);  // ERROR

let myStrArray: string[] = [];
myStrArray.push("World");

class Car {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    };

    display = (): void => console.log("My name is " + this.name);

    getName = (): string => this.name;
    getAge = (): number => this.age;
}

let car1: Car = new Car("Tata", 5);

//Question: How to decl an array of Car objects
let cars: Car[] = [];
cars.push(new Car("Tata", 5));
let car2: Car = new Car("Toyata", 65);
cars.push(car2);

// Tuple decl and initilization 
let myArray2: [number, number, number] = [5, 10, 20];

let myArray3: [number, string, boolean] = [5, "Hello", true];

myArray3[0] = 1600;
// myArray3[0] = "6"; ERROR

myArray3.push("World"); // Fine
myArray3.push(10);  // Fine
myArray3.push(false);  // Fine

console.log(myArray3);


// Declaring Enums
enum ModelYear { Year2020 = 2020, Year2021, Year2022, Year2023 }

class Bus {
    name: string;
    modelYear: ModelYear;

    constructor(name: string, modelYear: ModelYear) {
        this.name = name;
        this.modelYear = modelYear;
    };


}

let bus1: Bus = new Bus("TataBus", ModelYear.Year2023);

console.log(`Bus1 Model year  ${bus1.modelYear}`);


// Declaration of arrow function in TS
const add = (x: number, y: number): number => x + y;

function f1(name: string): string {
    return name.toUpperCase();
}


// Declaration of types in object literals


let BiCycle1: {    name: string,    age: number} = {
    name: "B1",
    age: 20
}

//In Plain JS, above can be written as
let BiCycle2= {
    name: "B1",
    age: 20
}