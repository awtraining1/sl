import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template:'<p> Blah Blah </p>',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MY FIRST ANGULAR PROJECT';

  productPrice:string =20 + 'INR';

  fontSizePx = 16;
}
