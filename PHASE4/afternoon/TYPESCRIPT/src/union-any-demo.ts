let a4 : number | string | Bike ;

a4=100;
a4="Hello";
a4 = new Bike("asas", 100, 2023);

// a4=true; // ERR

// Switch off type checking
let a5 : any;

a5=100;
a5="Hello";
a5 = new Bike("asas", 100, 2023);

a5=true; 