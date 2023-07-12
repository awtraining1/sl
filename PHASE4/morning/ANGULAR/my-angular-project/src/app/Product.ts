export class Product{
  id!:number;
  name:string='Default Electronic Item';
  price:number=0;
  imageUrl:string;
  imageWidth:string;
  isSpecial:boolean;
  inStock:boolean;

  constructor(id:number=0, name:string='', price:number=0, imageUrl:string='', imageWidth:string='', isSpecial:boolean=false, inStock:boolean=false){
    this.id=id;
    this.name = name;
    this.price =  price; 
    this.imageUrl = imageUrl;
    this.imageWidth = imageWidth;
    this.isSpecial=isSpecial;
    this.inStock= inStock;
  }

}