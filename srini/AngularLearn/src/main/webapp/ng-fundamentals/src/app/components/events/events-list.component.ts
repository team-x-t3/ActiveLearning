import { Component, OnInit } from '@angular/core';
import { EventService } from '../../services/event.service';
import { RouterModule, Router, ActivatedRoute } from '../../../../node_modules/@angular/router';
import { Observable } from '../../../../node_modules/rxjs';
import { IEvent } from '../../models/event.model';

@Component({
    selector: 'app-event-list',
    templateUrl: 'events-list.component.html'
})
export class EventListComponent implements OnInit {
    private count = 0;
    eventList: IEvent[];

    constructor(private eventService: EventService, private router: Router, private route: ActivatedRoute) {

    }
    catchClickEvent(data): void {
        this.count++;
        console.log('event caught by parent ', data, this.count);
    }

    ngOnInit() {
        // this.eventService.getEvents().subscribe(events => this.eventList = events);
        this.eventList = this.route.snapshot.data['events'];
    }
    handleClick(event) {
        this.router.navigate(['events', event.id]);
    }
}
