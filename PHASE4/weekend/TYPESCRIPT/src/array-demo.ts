import {Person} from './interface-demo';

let myArr1 = []; // in Plain JS


let myArr2 : string[] = []; // in TS

let myArr3 : number[] = []; // in TS

let myArr4 : Person[] = []; // in TS

myArr4.push(new Person("Sujata") );
myArr4.push(new Person("Manoj") );

console.log(myArr4[0].name);