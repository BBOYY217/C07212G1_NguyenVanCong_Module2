package case_study.services.customer;

import case_study.model.Customer;
import case_study.services.Service;

public interface CustomerService extends Service<Customer> {
    void display();

    void add();
}
