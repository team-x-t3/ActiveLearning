import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-search-modal',
  templateUrl: './search-modal.component.html',
  styleUrls: ['./search-modal.component.css']
})
export class SearchModalComponent implements OnInit {
  @Input() title: string;
  constructor() { }

  ngOnInit() {
  }

}
