import { Directive, OnInit, Inject, ElementRef } from "../../../node_modules/@angular/core";
import { JQ_TOKEN } from "../services/jQuery.service";

@Directive({
    selector: '[appModalTrigger]'
})
export class ModalTriggerDirective implements OnInit {
    el: HTMLElement;
    constructor(ref: ElementRef, @Inject(JQ_TOKEN) private $: any) {
        this.el = ref.nativeElement;
    }

    ngOnInit() {
        this.el.addEventListener('click', e => {
            this.$('#simple-modal').modal({});
        });
    }
}
