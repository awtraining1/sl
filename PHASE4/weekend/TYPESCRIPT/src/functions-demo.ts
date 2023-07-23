// function f1(x,y){
    
//     return x+y
//  }

function f1(x:number,y:number) :number {
    
    return x+y
 };

const arrowf1 = (x:number,y:number) :number => x+y;

 function f2(x:number,y:number) :void {
    
    console.log( x+y ) ;
 };


 let result:number = f1(4,5);
 console.log(result);

 let arrow_result:number = arrowf1(4,5);
 console.log(arrow_result);

 f2(40,5);
