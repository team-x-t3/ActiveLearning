import {
  Component,
  OnInit,
  Input,
  Output,
  EventEmitter
} from '@angular/core';
import {
  FormGroup,
  FormControl,
  Validators
} from '../../../../node_modules/@angular/forms';
import { ISession } from '../../models/event.model';
import { EventService } from '../../services/event.service';

@Component({
  selector: 'app-create-session',
  templateUrl: './create-session.component.html',
  styleUrls: ['./create-session.component.css']
})
export class CreateSessionComponent implements OnInit {
  @Input() eventId: number;
  @Output() saveEventEmit = new EventEmitter();
  sessionForm: FormGroup;
  sessionName: FormControl;
  presenter: FormControl;
  duration: FormControl;
  level: FormControl;
  abstract: FormControl;

  constructor(private eventSer: EventService) { }

  ngOnInit() {
    this.sessionName = new FormControl('', Validators.required);
    this.presenter = new FormControl('', Validators.required);
    this.duration = new FormControl('', Validators.required);
    this.level = new FormControl('', Validators.required);
    this.abstract = new FormControl('', [Validators.required, Validators.minLength(10)]);
    this.sessionForm = new FormGroup({
      name: this.sessionName,
      presenter: this.presenter,
      duration: this.duration,
      level: this.level,
      abstract: this.abstract
    });
  }

  saveSession(sessionFormValue: ISession) {
    sessionFormValue.voters = [];
    console.log(sessionFormValue, this.eventId);
    this.eventSer.addSession(sessionFormValue, this.eventId);
    this.saveEventEmit.emit('save');
  }

  cancel() {
    this.saveEventEmit.emit('cancel');
  }

}
