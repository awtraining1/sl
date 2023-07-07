interface Human{
    name:string,

    walk() : void ;
}

class Person implements Human{
    name:string;

    constructor(name:string){
        this.name=name;
    }

    walk = () : void => console.log(" Walking ...") ;
}