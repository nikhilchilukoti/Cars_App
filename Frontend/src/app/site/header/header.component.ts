import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { UserAuthService } from 'src/app/service/authorization/user-auth.service';
import { AuthenticationService } from 'src/app/service/authorization/authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  username: string;
  isAdminbool:string;
  constructor(private userAuthService: UserAuthService, private router: Router,
     private authenticationService: AuthenticationService) { }

  ngOnInit() {
  }
  getUser() {
    this.username = this.userAuthService.getUser();
    return this.username;
  }

  isLogin() {
    return this.userAuthService.loggedIn;
  }

  onSignOut() {
    this.userAuthService.setLog(false);
    this.authenticationService.setToken(null);
    this.router.navigateByUrl('login');
  }

  isAdmin()
  {
    this.isAdminbool=this.getUser();
if(this.isAdminbool=="admin")
return true;
else{
  return false;
}
  }
}