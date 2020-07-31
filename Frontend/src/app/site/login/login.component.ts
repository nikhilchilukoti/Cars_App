import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { AuthenticationService } from 'src/app/service/authorization/authentication.service';
import { UserAuthService } from 'src/app/service/authorization/user-auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  formValidation: boolean = true;
  error: String = '';
  loader: boolean;
  constructor(private formbuilder: FormBuilder,
    private router: Router, 
    private authenticationService: AuthenticationService, 
    private userAuthService: UserAuthService) { }

  ngOnInit() {
    this.loginForm = this.formbuilder.group({
      username: ['', [
        Validators.required
      ]],
      password: ['', [
        Validators.required
      ]]
    })
  }
  get username() { return this.loginForm.get('username'); }
  get password() { return this.loginForm.get('password'); }

  login() {

    console.log("welcome");
    this.authenticationService.authenticate(this.username.value, this.password.value).subscribe(data => {
      console.log(this.username.value)
      console.log(this.password.value)
      this.formValidation = true;
      this.userAuthService.setUser(this.username.value);
      this.authenticationService.setToken(data.token);
      this.userAuthService.setRole(data.role);
      this.userAuthService.setLog(true);
      console.log(data.role);
      if(data.role=="ADMIN"){
        this.router.navigate(["admin"]);
      }else{
        this.router.navigate(["user"]);
      }
      
    },
      error => {
        this.formValidation = false;
        console.log(this.username.value)
        console.log(this.password.value)
        if (error.status == 401) {
          this.error = "Invalid Username/Password";
        }
      });
  }

}