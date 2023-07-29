export class Product {
    name!: string;
    price!: number;

    imageUrl!:string;

    dateAdded!: string;

    isSpecial!:boolean;
    inStock!:boolean;

    constructor(name: string ="", price: number=0, isSpecial:boolean=false,inStock:boolean=true, imageUrl:string="", dateAdded: string="") {
        this.name = name;
        this.price = price;
        this.isSpecial = isSpecial;
        this.inStock=inStock;
        this.imageUrl = imageUrl;
        this.dateAdded = dateAdded;
    }
}
