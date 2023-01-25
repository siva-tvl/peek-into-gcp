import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { OnInit } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'student-management-ui';
  healthStatus:string = "serverSideCall";

  constructor(private http:HttpClient) {
    this.checkStatus();
  }


  checkStatus(){
    this.http.get("http://localhost:8080/healthStatus").subscribe( ( data:any)=> { this.healthStatus=data.data } );
    console.log(this.healthStatus);
  }
}

