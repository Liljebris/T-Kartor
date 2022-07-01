import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

const httpOptions = {
  headers: { 'Content-Type': 'application/json' },
};

@Injectable({
  providedIn: 'root',
})
export class FileService {
  private getTextUrl: string;
  private postTextUrl: string;
  public message: string;

  constructor(private http: HttpClient) {
    this.getTextUrl = 'http://localhost:8080/getText';
    this.postTextUrl = 'http://localhost:8080/postText';
    this.message = '';
  }


  save(content: string) {
    this.http.post<string>(this.postTextUrl, content);
  }

  postTextToFile(s: string): Observable<any> {
    return this.http.post(this.postTextUrl, s, {
      headers: new HttpHeaders({
        'Content-Type': 'text/plain',
      }),
    });
  }

  getTextFromFile(): string {
    this.http
      .get(this.getTextUrl, { responseType: 'text' })
      .subscribe((data) => (this.message = data));
    return this.message;
  }
}
