import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-collapsible-well',
  templateUrl: './collapsible-well.component.html',
  styleUrls: ['./collapsible-well.component.css']
})
export class CollapsibleWellComponent implements OnInit {
  contentVisible: boolean;
  @Input() title: string;
  constructor() { }

  ngOnInit() {
  }

  toggleContent() {
    this.contentVisible = !this.contentVisible;
  }

}
