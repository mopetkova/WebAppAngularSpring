import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientInMemoryWebApiModule} from 'angular-in-memory-web-api';
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {FormsModule} from "@angular/forms";

import { AppComponent } from './app.component';
import {CrudComponent} from "./crud/crud.component";
import {UpdateComponent} from "./update/update.component";

import {InMemoryDataService} from "./in-memory-data.service";

import {AppRoutingModule} from './app-routing.module';

import { Location } from '@angular/common';
import {HttpModule} from "@angular/http";
import {DetailComponent} from "./detail/detail.component";


@NgModule({
  declarations: [
    AppComponent,
    CrudComponent,
    UpdateComponent,
    DetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,

    HttpClientInMemoryWebApiModule.forRoot(
      InMemoryDataService, {dataEncapsulation: false}
    )
  ],
  // providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
