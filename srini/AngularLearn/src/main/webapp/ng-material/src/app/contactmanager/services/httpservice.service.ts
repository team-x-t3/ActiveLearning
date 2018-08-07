import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '../../../../node_modules/@angular/common/http';
import { Observable, of } from '../../../../node_modules/rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HttpserviceService {

  constructor(private httpClient: HttpClient) {

  }

  get<T>(url: string, tag: string, optionalResult: T, options?: HttpOptions): Observable<T> {
    return <Observable<T>>this.httpClient.get(url, options).pipe(catchError(this.handleError(tag, optionalResult)));
  }

  post() {

  }
  put() {

  }
  delete() {

  }

  private handleError<T>(tag: string, optionalResult: T) {
    return (error) => {
      console.error(tag, error);
      return of(optionalResult as T);
    };
  }


}
class HttpOptions {
  headers?: HttpHeaders | {
    [header: string]: string | string[];
  };
  observe: 'events';
  params?: HttpParams | {
    [param: string]: string | string[];
  };
  reportProgress?: boolean;
  responseType?: 'json';
  withCredentials?: boolean;
}
