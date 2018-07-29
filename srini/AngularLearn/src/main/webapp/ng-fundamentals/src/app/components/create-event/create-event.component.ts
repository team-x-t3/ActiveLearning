import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { FormGroup } from '../../../../node_modules/@angular/forms';
import { Router } from '../../../../node_modules/@angular/router';
import { EventService } from '../../services/event.service';
import { IEvent } from '../../models/event.model';

@Component({
  selector: 'app-create-event',
  templateUrl: './create-event.component.html',
  styleUrls: ['./create-event.component.css']
})
export class CreateEventComponent implements OnInit {
  @ViewChild('newEventForm') newEventForm: ElementRef<FormGroup>;
  isFormDirty: boolean;
  constructor(private router: Router, private eventService: EventService) { }

  ngOnInit() {
  }
  thinkOfSave() {
    console.log('hover event', this.newEventForm);
    Object.keys(this.newEventForm.nativeElement.controls).forEach(field => {
      const control = this.newEventForm.nativeElement.get(field);
      control.markAsTouched();
    });
  }
  cancel() {
    this.isFormDirty = true;
    this.router.navigate(['/events']);
  }

  saveEvent(formValue: IEvent) {
    console.log(formValue);
    this.isFormDirty = false;
    this.eventService.saveEvent(formValue);
    this.router.navigate(['/events']);

  }
}
