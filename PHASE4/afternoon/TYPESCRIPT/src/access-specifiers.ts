class Bus{
    name:string;
    private mileage:number;
    protected age:number;

    readonly engineType: string;

    constructor(name:string, mileage:number , age:number, engineType: string){
        this.name=name;
        this.mileage=mileage;
        this.age=age;
        this.engineType= engineType;
    }

    showMileage = ():number => this.mileage; 
}


let bus3 : Bus = new Bus("ford",100, 90, "petrol"); // in TS

console.log(`Bus3 engine Type is ${bus3.engineType}`);
// bus3.engineType = "Electric"; // ERROR  because engineType is readonly

bus3.name; // name is public, so fine to access here
bus3.name = "Toyata";

// bus3.mileage; // ERROR mileage is private
bus3.showMileage(); // Fine

// age is protected, so not accessible here;
// bus3.age; // ERROR

