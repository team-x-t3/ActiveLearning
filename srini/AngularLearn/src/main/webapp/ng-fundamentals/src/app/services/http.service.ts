import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '../../../node_modules/@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private http: HttpClient) {
  }

  /**
   *
   * @param url Url to be accessed
   * @param tag calling method info intended for logging in case of failure
   * @param optionalResult result to be returned on failure
   * @param options http options
   */
  get<T>(url: string, tag: string, optionalResult: T, options?: HttpOptions): Observable<T> {
    return <Observable<T>>this.http.get<T>(url, options).pipe(catchError(this.handleError<T>(tag, optionalResult)));
  }


  private handleError<T>(tag: string, result: T) {
    return (err: any): Observable<T> => {
      console.error(tag, err);
      return of(result as T);
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
