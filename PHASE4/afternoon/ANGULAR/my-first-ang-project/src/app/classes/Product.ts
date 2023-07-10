export class Product{

  name:string='';
  price:number=0;
  imgSrc:string='';
  isSpecial:boolean=false;

  constructor(name:string, price:number,imgSrc:string,isSpecial:boolean){
    this.name = name;
    this.price = price;
    this.imgSrc=imgSrc;
    this.isSpecial=isSpecial;
  }

}