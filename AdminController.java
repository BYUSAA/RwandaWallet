import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MoneyTransferRepository transferRepository; // Added this missing repository

    @GetMapping("/all-balances")
    public List<Customer> getAllCustomersBalance() {
        return customerRepository.findAll();
    }

    @GetMapping("/history")
    public List<MoneyTransfer> getAllMoneyTransfers() {
        return transferRepository.findAll();
    }
}
