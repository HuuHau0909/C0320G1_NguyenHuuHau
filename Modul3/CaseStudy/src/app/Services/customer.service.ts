import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public API: string = 'http://localhost:3000/customers';

  constructor(
    public http: HttpClient
  ) {
  }

  getAllCustomers(): Observable<any> {
    return this.http.get(this.API);
  }

  getCustomerById(customerId): Observable<any> {
    return this.http.get(this.API + '/' + customerId)
  }

  addNewCustomer(customer): Observable<any> {
    return this.http.post(this.API, customer)
  }

  deleteCustomer(customerId) {
    return this.http.delete((this.API+'/'+customerId))
  }

  editCustomer(customer, customerId): Observable<any> {
    return this.http.put(this.API+'/'+ customerId,customer);
  }
}
