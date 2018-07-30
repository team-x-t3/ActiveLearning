import {
  Component,
  OnInit,
  Input,
  OnChanges
} from '@angular/core';
import {
  ISession
} from '../../models/event.model';

@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.css']
})
export class SessionListComponent implements OnInit, OnChanges {
  @Input() sessions: ISession[];
  sortFiltSessions: ISession[];
  @Input() filterType: string;
  @Input() sortType: string;
  constructor() { }

  ngOnInit() {
    console.log('ngInit session list');
    // this.sortFiltSessions = this.sessions.slice(0);
  }

  ngOnChanges() {
    console.log('ngOnchages session list');
    console.log(this.filterType, this.sessions);
    this.filterBy(this.filterType);
    this.sortType === 'name' ? this.sortFiltSessions.sort(sortByNameAsc) : this.sortFiltSessions.sort(sortByVotesDsc);
  }



  private filterBy(filter) {
    if (filter === 'all') {
      this.sortFiltSessions = this.sessions.slice(0);
    } else {
      this.sortFiltSessions = [];
      this.sortFiltSessions = this.sessions.filter(session => {
        return session.level.toLowerCase() === filter.toLowerCase();
      });
    }
  }
}

function sortByNameAsc(s1: ISession, s2: ISession) {
  if (s1.name > s2.name) {
    return 1;
  } else if (s1.name === s2.name) {
    return 0;
  } else {
    return -1;
  }
}

function sortByVotesDsc(s1: ISession, s2: ISession) {
  return s2.voters.length - s1.voters.length;
}
