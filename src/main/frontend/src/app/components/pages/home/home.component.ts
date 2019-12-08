import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  getResponse: string;

  name = 'test name';
  postResponse: string;

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    this.http.get('/api/hello', { responseType: 'text' }).subscribe(resp => {
      this.getResponse = resp;
    });
  }

  sendData() {
    var formData: any = new FormData();
    formData.append('name', this.name);

    this.http.post('/api/hello', formData, { responseType: 'text' }).subscribe(
      (resp) => {
        console.log(resp);
        this.postResponse = resp;
      },
      (error) => {
        console.log(error);
        this.postResponse = '';
      }
    );
  }
}