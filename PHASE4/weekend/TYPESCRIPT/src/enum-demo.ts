enum ModelYear { Year2020=2020, Year2021, Year2022, Year2023 }


class Bike{
    name:string;
    mileage:number;
    modelYr:ModelYear;

    constructor(name:string, mileage:number,modelYr:ModelYear  ){
        this.name=name;
        this.mileage=mileage;
        this.modelYr=modelYr;
    }

}

let bike1 : Bike =  new Bike("Bullet", 100, ModelYear.Year2023 );