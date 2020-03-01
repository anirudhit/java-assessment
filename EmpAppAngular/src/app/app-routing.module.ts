import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { ComponentListComponent } from './component-list/component-list.component';
import { StarComponent } from './star/star.component';


const routes: Routes = [
  {path: 'components', component: ComponentListComponent},
  {path: 'home', component: HomeComponent},
  {path: '', component: HomeComponent}
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
  StarComponent
];
