package springboot.desafio.itau.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import springboot.desafio.itau.dto.EstatistcDto;
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

    public void delete(){
        this.listTransactions.clear();
        
    }

    public EstatistcDto getEstastiticas() {
        OffsetDateTime limite = OffsetDateTime.now().minusSeconds(60);
        DoubleSummaryStatistics stats = listTransactions.stream()
            .filter(t -> t.getDate().isAfter(limite))
            .mapToDouble(Transaction::getVal)
            .summaryStatistics();
        long count = stats.getCount();
        return count == 0
            ? new EstatistcDto(0, 0.0, 0.0, 0.0, 0.0)
            : new EstatistcDto(
                    count,
                    stats.getSum(),
                    stats.getAverage(),
                    stats.getMin(),
                    stats.getMax()
            );
    }
}
