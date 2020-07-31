import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { OrderCreationScreenComponent } from './order-creation-screen/order-creation-screen.component';
import { OrderSearchScreenComponent } from './order-search-screen/order-search-screen.component';
import { ErrorComponent } from './error/error.component';
import { AuthGuard } from './service/authorization/auth.guard';
import { LoginComponent } from './site/login/login.component';
import { LogoutComponent } from './site/logout/logout.component';
import { AdminComponent } from './site/admin/admin.component';
import { UserComponent } from './site/user/user.component';

const routes: Routes = [
  {path:'', component:LoginComponent},
  {path:'login', component:LoginComponent},
  {path:'dashboard', component:DashboardComponent, canActivate:[AuthGuard]},
  {path:'ordercreationscreen', component:OrderCreationScreenComponent, canActivate:[AuthGuard]},
  {path:'ordersearchscreen', component:OrderSearchScreenComponent, canActivate:[AuthGuard]},
  {path:'logout', component:LogoutComponent, canActivate:[AuthGuard]},
  {path:'admin', component:AdminComponent, canActivate:[AuthGuard]},
  {path:'user', component:UserComponent, canActivate:[AuthGuard]},
  {path:'**', component:ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
