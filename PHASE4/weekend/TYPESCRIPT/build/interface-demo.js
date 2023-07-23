"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Person = void 0;
class Person {
    constructor(name) {
        this.name = name;
    }
    walkFast() {
        console.log("Walking ...., fast walking");
    }
}
exports.Person = Person;
;
let per1 = new Person("Sujata");
per1.walkFast();
//ABSTRACT CLASS DEMO
class ABC {
    constructor() {
        this.walkNormal = () => console.log("Walking ...., normal walking");
    }
}
// let abc1:ABC = new ABC(); // ERROR
class MyABC extends ABC {
    walkSlow() {
        console.log("Walking ...., slowing walking");
    }
}
let abc1 = new MyABC();
abc1.walkNormal();
abc1.walkSlow();
