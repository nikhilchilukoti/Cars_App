import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { OrderCreationScreenComponent } from './order-creation-screen/order-creation-screen.component';
import { OrderSearchScreenComponent } from './order-search-screen/order-search-screen.component';
import { ErrorComponent } from './error/error.component';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './site/login/login.component';
import { LogoutComponent } from './site/logout/logout.component';
import { HeaderComponent } from './site/header/header.component';
import { FooterComponent } from './site/footer/footer.component';
import { AdminComponent } from './site/admin/admin.component';
import { UserComponent } from './site/user/user.component';
import { RouterModule } from '@angular/router';

import { NgMultiSelectDropDownModule } from 'ng-multiselect-dropdown';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LogoutComponent,
    HeaderComponent,
    FooterComponent,
    DashboardComponent,
    OrderCreationScreenComponent,
    OrderSearchScreenComponent,
    ErrorComponent,
    AdminComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    RouterModule,
    NgMultiSelectDropDownModule.forRoot()
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
