import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FileService {

  private getTextUrl: string;
  private postTextUrl: string;

  constructor(private http: HttpClient) {
    this.getTextUrl = 'http://localhost:8080/getText';
    this.postTextUrl = 'http://localhost:8080/postText';
  }

  getTextFromFile(): Observable<string> {
    return this.http.get<string>(this.getTextUrl)
  }

  postTextToFile(content: string): Observable<string> {
    return this.http.post<string>(this.postTextUrl, content)
  }

  // public postText(file: File): String {
  //   this.http.post<File>(this.postTextUrl, file.);
  // }
}
