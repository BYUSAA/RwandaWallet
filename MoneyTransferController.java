import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class MoneyTransferController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/send")
    public String sendMoney(@RequestParam String fromPhoneNumber,
                            @RequestParam String toPhoneNumber,
                            @RequestParam double amount,
                            @RequestParam String pin) {
        Customer sender = customerRepository.findById(fromPhoneNumber).orElse(null);
        Customer receiver = customerRepository.findById(toPhoneNumber).orElse(null);

        if (sender == null || receiver == null) {
            return "Sender or Receiver not found!";
        }
        if (!sender.getPin().equals(pin)) {
            return "Invalid PIN!";
        }
        if (sender.getBalance() < amount) {
            return "Insufficient balance!";
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);
        customerRepository.save(sender);
        customerRepository.save(receiver);

        return "Transfer successful!";
    }
}
