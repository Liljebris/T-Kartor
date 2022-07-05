import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root',
})
export class FileService {
  private getTextUrl: string;
  private postTextUrl: string;


  constructor(private http: HttpClient) {
    this.getTextUrl = 'http://localhost:8080/getText';
    this.postTextUrl = 'http://localhost:8080/postText';
  }

  // POST request for "/postText" url endpoint
  // Interpreting the original media type as text
  postTextToFile(s: string): Observable<any> {
    return this.http.post(this.postTextUrl, s, {
      headers: new HttpHeaders({
        'Content-Type': 'text/plain',
      }),
    });
  }

  // Get request from "/getText" url endpoint, given value text
  getTextFromFile(): Observable<string>  {
    return this.http.get(this.getTextUrl, {
      responseType: 'text'
    });
  }
}
