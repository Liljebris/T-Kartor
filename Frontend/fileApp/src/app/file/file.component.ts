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

  // Method that subscribes to the data
  send() {
    this.fileService
      .postTextToFile(this.giveableContent)
      .subscribe((data: any) => {
        this.result = data;
      });
  }

  get() {
    this.receivableContent = this.fileService.getTextFromFile();
  }
}
