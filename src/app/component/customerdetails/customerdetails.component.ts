import { Component, OnInit } from '@angular/core';
import { Customermodal } from 'src/app/modal/customermodal';
import { CustomerserviceService } from 'src/app/service/customerservice.service';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent implements OnInit {

  customer: Customermodal;

  constructor(private service: CustomerserviceService) {

    this.customer=new Customermodal();
   }

  ngOnInit(): void {
    this.getCustomerDetail();
  }

  getCustomerDetail() {
    this.service.getCustomerDetails("avanish")
      .subscribe(data => { this.customer =data
          console.log(this.customer);},
          error => {
            console.log(error);
          },)
      };
  

}
