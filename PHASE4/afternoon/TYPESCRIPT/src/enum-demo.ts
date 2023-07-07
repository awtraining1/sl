enum ModelYear {ModelYear2021=2021, ModelYear2022,ModelYear2023,ModelYear2024}

console.log(ModelYear.ModelYear2023);

class Bike{
    name:string;
    mileage:number;
    modelYr:ModelYear

    constructor(name:string, mileage:number,modelYr:ModelYear  ){
        this.name=name;
        this.mileage=mileage;
        this.modelYr=modelYr;
    }
}

let bike1 : Bike =  new Bike("Bullet", 100, ModelYear.ModelYear2023 );