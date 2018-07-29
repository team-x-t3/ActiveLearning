import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { IEvent } from '../../models/event.model';

@Component({
  selector: 'app-eventthumbnail',
  templateUrl: './eventthumbnail.component.html',
  styleUrls: ['./eventthumbnail.component.css']
})
export class EventthumbnailComponent implements OnInit {
  @Input() event: IEvent;
  @Output() clickEvent = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }
  handleClickMe(): void {
    console.log('CLick event!!');
    this.clickEvent.emit('Hello Click');
  }
}
