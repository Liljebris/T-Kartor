import { Component, ElementRef, OnInit, ViewChild } from "@angular/core";

import { FileService } from './file.service';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { FormControl } from "@angular/forms";


@Component({
  selector: 'app-file',
  templateUrl: './file.component.html',
  providers: [FileService]
})

export class FileComponent implements OnInit {

  content = "";
  result: string | undefined;


  constructor(private fileService: FileService) { }

  // @ViewChild('fileEditInput')
  // set fileEditInput(element: ElementRef<HTMLInputElement>) {
  //   if (element) {
  //     element.nativeElement.focus();
  //   }
  // }

  ngOnInit() {}

  // updateContent(string content) {
  //   this.content2.setValue(content);
  // }


  // addText(content: string): void {
  //   this.editFile = undefined;
  //   content = content.trim();

  //   const editiedFile: File ={content} as File;
  //   this.fileService.postTextToFile(editiedFile);
  // }

  send() {
    alert('success');
    this.fileService.send(this.content).subscribe((data: any) =>
    {this.result = data})
  }



  // addText2(content: string): void {
  //   this.fileService.save(content);
  // }

  // getText(): Observable<string> {
  //   this.content = this.fileService.getTextFromFile();
  //   return this.fileService.getTextFromFile();
  // }

  // getText3(): string {
  //   this.content = this.fileService.getTextFromFile();
  //   return this.fileService.getTextFromFile();
  // }
  // updateFile(file: File): Observable<File> {

  // // }

  // updateName() {

  // }


}
