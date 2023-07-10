export class Product{

  name:string='';
  price:number=0;
  imgSrc:string='';

  constructor(name:string, price:number,imgSrc:string){
    this.name = name;
    this.price = price;
    this.imgSrc=imgSrc;
  }

}