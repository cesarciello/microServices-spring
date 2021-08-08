package ciello.arsenal.course.hrpayroll.service;

import org.springframework.stereotype.Service;

import ciello.arsenal.course.hrpayroll.domain.Payment;

@Service
public class PaymentService {
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200d, days);
	}
}
