"use strict";
class Person {
    constructor(name) {
        this.name = name;
    }
    walkFast() {
        console.log("Walking ...., fast walking");
    }
}
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
