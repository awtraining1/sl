export class Product {
    name!: string;
    price!: number;

    imageUrl!:string;

    dateAdded!: string;

    isSpecial!:boolean;

    constructor(name: string ="", price: number=0, isSpecial:boolean=false,imageUrl:string="", dateAdded: string="") {
        this.name = name;
        this.price = price;
        this.isSpecial = isSpecial;
        this.imageUrl = imageUrl;
        this.dateAdded = dateAdded;
    }
}
