import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    private static final double INITIAL_BALANCE = 10000000.00;

    @PostMapping("/register")
    public String registerCustomer(@RequestBody Customer customer) {
        if (customerRepository.existsById(customer.getPhoneNumber())) {
            return "Customer already exists!";
        }
        customer.setBalance(INITIAL_BALANCE);
        customerRepository.save(customer);
        return "Registration successful!";
    }

    @GetMapping("/{phoneNumber}")
    public Customer getCustomerProfile(@PathVariable String phoneNumber) {
        return customerRepository.findById(phoneNumber).orElse(null);
    }
}
