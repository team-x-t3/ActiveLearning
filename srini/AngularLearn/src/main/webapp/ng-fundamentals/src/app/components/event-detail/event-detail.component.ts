import { Component, OnInit } from '@angular/core';
import { EventService } from '../../services/event.service';
import { ActivatedRoute, Params } from '@angular/router';
@Component({
  selector: 'app-event-detail',
  templateUrl: './event-detail.component.html',
  styleUrls: ['./event-detail.component.css']
})
export class EventDetailComponent implements OnInit {
  event: any;
  constructor(private eventService: EventService, private route: ActivatedRoute) { }
  createSessionMode: boolean;
  sortType = 'name';
  filterType = 'all';
  ngOnInit() {
    this.route.data.forEach((data) => {
      this.event = data['event'];
    });
  }

  sessionCreated(eventEmmited) {
    this.createSessionMode = false;
  }

}
