interface Human{
    name:string;

    walkFast():void ;
}


class Person implements Human{
    name:string;

    constructor(name:string){
        this.name = name;
    }

    walkFast():void {
        console.log("Walking ...., fast walking");
    }
}

let  per1: Person = new Person("Sujata");
per1.walkFast();

abstract class ABC{

   abstract walkSlow():void ;

   walkNormal = () =>  console.log("Walking ...., normal walking");
}

// let abc1 : ABC = new ABC(); // Error Cannot create an instance of an abstract class