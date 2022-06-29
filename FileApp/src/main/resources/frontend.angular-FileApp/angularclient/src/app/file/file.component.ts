import { Component, ElementRef, OnInit, ViewChild } from "@angular/core";

import { File } from './file';
import { FileService } from './file.service';


@Component({
  selector: 'app-file',
  templateUrl: './file.component.html',
  providers: [FileService]
})

export class FileComponent implements OnInit {
  file: File[] = [];
  id = ""
  content = "";

  constructor(private fileService: FileService) { }

  @ViewChild('fileEditInput')
  set fileEditInput(element: ElementRef<HTMLInputElement>) {
    if (element) {
      element.nativeElement.focus();
    }
  }

  ngOnInit() {}

  addText(content: string): void {
    this.fileService.postTextToFile(content);
  }


}
