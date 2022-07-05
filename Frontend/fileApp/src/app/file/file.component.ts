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
  isReadOnly = true;

  constructor(private fileService: FileService) {}

  ngOnInit() {}


  toggleCool() { this.isReadOnly = !this.isReadOnly; }

  send() {
    // Alert popup for when nothing has been typed
    if (this.giveableContent == '') {
      alert('Please write something before posting.');
    } else {

      // Subscribing to the observable instance from service post method
      this.fileService
        .postTextToFile(this.giveableContent)
        .subscribe((data: any) => {
          this.result = data;
        });
    }
  }

  // Subscribing to the observable instance from service get method
  get() {
    this.fileService
      .getTextFromFile()
      .subscribe((data: any) => (this.receivableContent = data));
  }
}
