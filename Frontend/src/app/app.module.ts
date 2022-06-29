import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule} from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { FileComponent } from './file/file.component';


@NgModule({
  declarations: [
    AppComponent,
    FileComponent,
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    FileComponent,
  ],
  providers: [],
  bootstrap: [
    AppComponent,
  

]

})
export class AppModule { }
