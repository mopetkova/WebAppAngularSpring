import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {UpdateComponent} from "./update/update.component";
import {CrudComponent} from "./crud/crud.component";
import {DetailComponent} from "./detail/detail.component";


const routes: Routes = [
  { path: 'update/:id', component: UpdateComponent},
  { path: 'detail/:id', component: DetailComponent},
  { path: 'home', component: CrudComponent},
  { path: '', redirectTo: 'home', pathMatch: 'full' }
  // { path: 'detail/:id', component: HeroDetailComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
