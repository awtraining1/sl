export class Product{

  name:string='Default Electronic Item';
  price:number=0;
  imageUrl:string;
  imageWidth:string;
  isSpecial:boolean;
  inStock:boolean;

  constructor(name:string, price:number, imageUrl:string, imageWidth:string, isSpecial:boolean, inStock:boolean){
    this.name = name;
    this.price =  price; 
    this.imageUrl = imageUrl;
    this.imageWidth = imageWidth;
    this.isSpecial=isSpecial;
    this.inStock= inStock;
  }

}