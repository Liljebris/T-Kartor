import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatFormFieldModule } from '@angular/material/form-field';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule} from '@angular/forms';
import { MaterialExampleModule } from '../material.module';
import { TextFieldAutosizeTextareaExample } from './text-box/text-field-autosize-textarea-example';
import { MatNativeDateModule } from '@angular/material/core';
import { FileComponent } from './file/file.component';


@NgModule({
  declarations: [
    AppComponent,
    TextFieldAutosizeTextareaExample,
    FileComponent,
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    MaterialExampleModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    FileComponent,
  ],
  providers: [],
  bootstrap: [
    AppComponent,
    TextFieldAutosizeTextareaExample,

]

})
export class AppModule { }
