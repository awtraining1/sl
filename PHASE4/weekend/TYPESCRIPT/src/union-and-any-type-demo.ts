import { Person } from "./interface-demo";

let myVar: number | string | Person;

myVar =10;

myVar = "hello";

myVar = new Person("Baba");

// myVar = false; // ERROR

let myVar2:any;

myVar2= "aasdsds";
myVar2 = true;