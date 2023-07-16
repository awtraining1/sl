class Bus{

    constructor(name, modelYr){
        this.name=name;
        this.modelYr=modelYr;
    }

    displayDetails = () => {
        console.log(`BUS DETAILS Name=${this.name} and Model Year=${this.modelYr}`);
    };

    getName = () => this.name;
    getModelYr = () => this.modelYr;

};


class SpaceBus extends Bus{

    constructor(name, modelYr, destination){
        super(name, modelYr);
        this.destination=destination;
    }

    getDestination = () => this.destination;

    displayDetails = () => {
        //console.log(`SPACE BUS DETAILS Name=${this.name} and Model Year=${this.modelYr} Destination=${this.destination}`);
        console.log(`SPACE BUS DETAILS ${this.getName()} ,  ${this.getModelYr()},  Destination=${this.destination}`);
    };
}


