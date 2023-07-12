export class Product{
  id!:number;
  name:string='Default Electronic Item';
  price:number=0;
  imageUrl:string;
  imageWidth:string;
  isSpecial:boolean;
  inStock:boolean;

  constructor(id:number, name:string, price:number, imageUrl:string, imageWidth:string, isSpecial:boolean, inStock:boolean){
    this.id=id;
    this.name = name;
    this.price =  price; 
    this.imageUrl = imageUrl;
    this.imageWidth = imageWidth;
    this.isSpecial=isSpecial;
    this.inStock= inStock;
  }

}