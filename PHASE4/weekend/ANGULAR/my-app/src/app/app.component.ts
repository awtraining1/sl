import { Component } from '@angular/core';

@Component(
  {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
  }
)
export class AppComponent {
  title = 'my-app 123';
  myName = 'Jhonny Walker';

  pi:number=3.148575765;

  a:number=54523;
  b:number=2435355;

  today=new Date();

  
    obj: Object = { name: {fName: "Paul", lName:"Shan"},
    site:"VoidCanvas", luckyNumbers:[7,13,69] };
}

