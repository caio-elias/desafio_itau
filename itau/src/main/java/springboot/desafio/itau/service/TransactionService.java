package springboot.desafio.itau.service;

import java.time.OffsetDateTime;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import springboot.desafio.itau.model.Transaction;

@Service
public class TransactionService {
    private final Queue<Transaction> listTransactions = new ConcurrentLinkedQueue<>();


    public void addTransaction(Transaction t){
        this.listTransactions.add(t);
        return;
    }

    public boolean isValidTransaction(Transaction t){
        return t.getDate().isBefore(OffsetDateTime.now());
    }

}
