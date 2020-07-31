import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  message = 'Some Welcome Message'
  //String message = "Some Welcome Message"
  
  //public SpringBootFirstWebApplication() {	

  //ActivatedRoute
  constructor(private router:Router) { 

  }

  // void init() {
  ngOnInit(){
    
    
  }

  onscreensearch()
  {
    this.router.navigate(["ordersearchscreen"]);
  }
    //console.log('last line of getWelcomeMessage')

    //console.log("get welcome message");
  }
