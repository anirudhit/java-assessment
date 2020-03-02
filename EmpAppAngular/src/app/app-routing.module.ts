import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { ComponentListComponent } from './component-list/component-list.component';
import { StarComponent } from './component-list/star/star.component';
import { NgforComponent } from './component-list/ngfor/ngfor.component';
import { PipesComponent } from './component-list/pipes/pipes.component';
import { InteractionComponent } from './component-list/interaction/interaction.component';
import { EmplistComponent } from './component-list/emplist/emplist.component';
import { EmpdetailsComponent } from './component-list/empdetails/empdetails.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';




const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'components', component: ComponentListComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [
  HeaderComponent,
  FooterComponent,
  HomeComponent,
  ComponentListComponent,
  StarComponent,
  NgforComponent,
  PipesComponent,
  InteractionComponent,
  EmplistComponent,
  EmpdetailsComponent,
  PageNotFoundComponent
];
