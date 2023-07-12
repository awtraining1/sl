export class Product{

  name:string='';
  price:number=0;
  imgSrc:string='';
  isSpecial:boolean=false;
  inStock:boolean=true;

  constructor(name:string='', price:number=0,imgSrc:string='',isSpecial:boolean=false,inStock:boolean=false){
    this.name = name;
    this.price = price;
    this.imgSrc=imgSrc;
    this.isSpecial=isSpecial;
    this.inStock=inStock;
  }

}