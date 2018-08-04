import { Component, OnInit, Output, EventEmitter, NgZone } from '@angular/core';

const SMALL_SCREEN_SIZE = 720;

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  private mediaQuery: MediaQueryList = matchMedia(`(min-width:${SMALL_SCREEN_SIZE}px)`);
  constructor(private zone: NgZone) {
    this.mediaQuery.addListener(listner => {
      zone.run(() => {
        this.mediaQuery = listner;
      });
    });
  }

  ngOnInit() {

  }

  isSmallScreen(): boolean {
    return this.mediaQuery.matches;
  }

}
