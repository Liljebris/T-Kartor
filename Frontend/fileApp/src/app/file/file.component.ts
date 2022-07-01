import { Component, OnInit } from '@angular/core';

import { FileService } from './file.service';



@Component({
  selector: 'app-file',
  templateUrl: './file.component.html',
  providers: [FileService],
})

export class FileComponent implements OnInit {
  giveableContent = '';
  receivableContent = '';
  result: string | undefined;

  constructor(private fileService: FileService) {}

  ngOnInit() {}


  send() {
    this.fileService
      .postTextToFile(this.giveableContent)
      .subscribe((data: any) => {
        this.result = data;
      });
  }

  // Method loads
  get() {
    this.receivableContent = this.fileService.getTextFromFile();
  }
}
