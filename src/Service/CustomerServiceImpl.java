package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl  implements CustomerService{
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Pham Dang Linh", "ph.danglinh214@gmail.com", "Ha Noi"));
        customers.put(2, new Customer(2, "Pham Phuong Linh", "linhmobanhbao2808@gmail.com", "Ha Nam"));
        customers.put(3, new Customer(3, "Vu Quang Nguyen", "nguyen.vu2308@gmail.com", "Hai Duong"));
        customers.put(4, new Customer(4, "Nguyen Thi Phuong Anh", "minzinzin@gmail.com", "Thai Binh"));
        customers.put(5, new Customer(5, "Luong Thi Thu", "luonghinhthu@gmail.com", "Thai Binh"));
        customers.put(6, new Customer(6, "Nguyen Phuong Anh", "hanasieuquay@gmail.com", "Thai Binh"));
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
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
