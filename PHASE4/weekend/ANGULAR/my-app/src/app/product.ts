export class Product {
    name!: string;
    price!: number;

    imageUrl!:string;

    dateAdded!: string;

    constructor(name: string ="", price: number=0,imageUrl:string="", dateAdded: string="") {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.dateAdded = dateAdded;
    }
}
