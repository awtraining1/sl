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

abstract class ABC{

   abstract walkSlow():void ;

   walkNormal = () =>  console.log("Walking ...., normal walking");
}

// let abc1 : ABC = new ABC(); // Error Cannot create an instance of an abstract class