import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Customermodal } from '../modal/customermodal';


@Injectable({
  providedIn: 'root'
})
export class CustomerserviceService {

  constructor(private http: HttpClient) { }


  getCustomerDetails(firstName: string){
    return this.http.get<Customermodal>("http://localhost:8080/customer/"+firstName);
  }
}
