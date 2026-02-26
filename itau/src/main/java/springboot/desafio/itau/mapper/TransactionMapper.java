package springboot.desafio.itau.mapper;

import org.springframework.stereotype.Component;

import springboot.desafio.itau.dto.TransactionDto;
import springboot.desafio.itau.model.Transaction;

@Component
public class TransactionMapper {

    public Transaction toModel(TransactionDto dto) {
        Transaction t = new Transaction(dto.valor(), dto.dataHora());
        return t;
    }

    
}
