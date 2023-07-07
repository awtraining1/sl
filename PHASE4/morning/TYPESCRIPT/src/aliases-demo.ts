type MyNumberType = number; // MyNumberType is aln alias for the built-in type number

let x:MyNumberType; // same let x:number

type VendorName = string;

class Truck{
    name: VendorName;

    constructor( name: VendorName){
        this.name = name;
       };   
}