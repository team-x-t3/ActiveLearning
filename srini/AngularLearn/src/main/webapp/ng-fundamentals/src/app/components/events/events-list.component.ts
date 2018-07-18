import { Component, OnInit } from '@angular/core';
import { EventService } from '../../services/event.service';
import { RouterModule, Router } from '../../../../node_modules/@angular/router';

@Component({
    selector: 'app-event-list',
    templateUrl: 'events-list.component.html'
})
export class EventListComponent implements OnInit {
    private count = 0;
    eventList: any[];

    constructor(private eventService: EventService, private router: Router) {

    }
    catchClickEvent(data): void {
        this.count++;
        console.log('event caught by parent ', data, this.count);
    }

    ngOnInit() {
        this.eventList = this.eventService.getEvents();
    }
    handleClick(event) {
        this.router.navigate(['events', event.id]);
    }
}
