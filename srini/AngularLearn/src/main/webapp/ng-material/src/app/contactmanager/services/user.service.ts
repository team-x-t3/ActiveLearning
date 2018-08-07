import { Injectable } from '@angular/core';
import { HttpserviceService } from './httpservice.service';
import { User } from '../models/user';
import { BehaviorSubject, Observable } from '../../../../node_modules/rxjs';
import { filter } from '../../../../node_modules/rxjs/operators';

const usersUrl = 'https://angular-material-api.azurewebsites.net/users';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  private _users: BehaviorSubject<User[]>;
  private datastore: {
    users: User[];
  };
  constructor(private httpService: HttpserviceService) {
    this.datastore = { users: [] };
    this._users = new BehaviorSubject<User[]>([]);
  }

  get users(): Observable<User[]> {
    return this._users.asObservable();
  }

  userById(id: number): User {
    return this.datastore.users.find(user => user.id === id);
  }

  getContacts() {
    this.httpService.get<User[]>(usersUrl, 'getContacts', []).subscribe(contactList => {
      this.datastore.users = contactList;
      this._users.next(Object.assign({}, this.datastore).users);
    });
  }
}
