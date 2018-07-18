import { Component } from '@angular/core';

@Component({
    selector: 'app-event-list',
    templateUrl: 'events-list.component.html'
})
export class EventListComponent {
    private count = 0;
    eventList = [{
        name: 'Angular',
        date: '09/11/2018',
        time: '10:00 am',
        price: 10,
        location: {
            address: '#103,spalya',
            city: 'bengaluru',
            country: 'India'
        }

    }];

    catchClickEvent(data): void {
        this.count++;
        console.log('event caught by parent ', data, this.count);
    }
}
