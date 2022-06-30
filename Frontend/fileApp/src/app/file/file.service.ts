import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';


const httpOptions = {
  headers: { 'Content-Type': 'application/json' }
}

@Injectable({
  providedIn: 'root'
})
export class FileService {

  private getTextUrl: string;
  private postTextUrl: string;
  public message: string;

  constructor(private http: HttpClient) {
    this.getTextUrl = 'http://localhost:8080/getText';
    this.postTextUrl = 'http://localhost:8080/postText';
    this.message = "";
  }


  // getTextFromFile2(): string {

  // }


  postTextToFile(file: File): Observable<File> {
    console.log(file.text);
    return this.http.post<File>(this.postTextUrl, file, httpOptions);
  }
  save(content: string) {
    this.http.post<string>(this.postTextUrl, content);
  }

  send(s: string): Observable<any> {
    console.log("hello from fileservice");
    return this.http.post(this.postTextUrl, s, {
      headers: new HttpHeaders({
        'Content-Type': 'text/plain'
      })
    })
  }

  getTextFromFile() {
    this.http.get(this.getTextUrl, {responseType: 'text'}).subscribe(data => this.message = data);
    console.log(JSON.stringify(this.message));
  }

  // public postText(file: File): String {
  //   this.http.post<File>(this.postTextUrl, file.);
  // }
}
