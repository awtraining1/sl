"use strict";
// Obj literal in JS
let bus1 = {
    name: "Tata",
    model: 2022
};
// NOTE: Typescript accepts above plain JS way of declaring ObjLit. But internal
// it will infer that the above ObjLit is of the type {name:string, model:number }.
// Therefore below code is NOT valid 
// bus1 = {
//     name:10, 
//     model:2022
// }
// Obj literal in TS
let bus2 = {
    name: "Tata2",
    model: 2022
};
