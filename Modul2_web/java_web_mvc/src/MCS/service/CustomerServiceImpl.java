package MCS.service;

import MCS.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    public static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Thao", "thao@gmail.com", "Da Nang"));
        customers.put(2, new Customer(2, "Cuong", "thao@gmail.com", "Quang Nam"));
        customers.put(3, new Customer(3, "Tu", "thao@gmail.com", "Quang Binh"));
        customers.put(4, new Customer(4, "Hau", "thao@gmail.com", "Quang Nam"));
        customers.put(5, new Customer(5, "Son", "thao@gmail.com", "Quang Ngai"));
        customers.put(6, new Customer(6, "Tung", "thao@gmail.com", "Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remote(int id) {
        customers.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
