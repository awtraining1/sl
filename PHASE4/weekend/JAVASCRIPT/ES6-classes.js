class Bus{

    constructor(name, modelYr){
        this.name=name;
        this.modelYr=modelYr;
    }

    displayDetails = () => {
        return `BUS DETAILS Name=${this.name} and Model Year=${this.modelYr}`;
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
        return (`SPACE BUS DETAILS ${this.getName()} ,  ${this.getModelYr()},  Destination=${this.destination}`);
    };

    // displayDetails = () => {
    //     return `SPACE ${super.displayDetails()} , Destination=${this.destination}`;
    // };
}


