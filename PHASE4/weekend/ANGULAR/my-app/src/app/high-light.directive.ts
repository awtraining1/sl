import { Directive,ElementRef, Renderer2  } from '@angular/core';

@Directive({
  selector: '[highlight]'
})
export class HighLightDirective {

  constructor(elem:ElementRef,renderer:Renderer2) { 

    renderer.setStyle(elem.nativeElement,'background-color','lightgreen');
    
  }

}
