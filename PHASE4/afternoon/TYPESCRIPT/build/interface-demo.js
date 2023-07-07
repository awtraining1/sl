"use strict";
class Person {
    constructor(name) {
        this.name = name;
    }
    walkFast() {
        console.log("Walking ...., fast walking");
    }
}
class ABC {
    constructor() {
        this.walkNormal = () => console.log("Walking ...., normal walking");
    }
}
