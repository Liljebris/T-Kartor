import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';


@Injectable({
  providedIn: 'root',
})
export class FileService {
  private getTextUrl: string;
  private postTextUrl: string;
  private message: string;

  constructor(private http: HttpClient) {
    this.getTextUrl = 'http://localhost:8080/getText';
    this.postTextUrl = 'http://localhost:8080/postText';
    this.message = this.getTextFromFile(); // Load message
  }

  //POST request for /postText url endpoint with JSON object
  postTextToFile(s: string): Observable<any> {
    return this.http.post(this.postTextUrl, s, {
      headers: new HttpHeaders({
        'Content-Type': 'text/plain',
      }),
    });
  }

  //GET request for /getText url endpoint.
  //Should not have subscribe here. Because of state change
  //you're forced to press button twice to get result after change.
  getTextFromFile(): string {
    this.http
      .get(this.getTextUrl, { responseType: 'text' })
      .subscribe((data) => (this.message = data));
    return this.message;
  }
}
