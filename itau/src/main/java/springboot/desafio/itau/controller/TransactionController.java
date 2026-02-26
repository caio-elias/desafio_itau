package springboot.desafio.itau.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import springboot.desafio.itau.dto.TransactionDto;
import springboot.desafio.itau.mapper.TransactionMapper;
import springboot.desafio.itau.model.Transaction;
import springboot.desafio.itau.service.TransactionService;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/transacao")
public class TransactionController {
    private  final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    public TransactionController(TransactionService transactionService, TransactionMapper transactionMapper) {
        this.transactionService = transactionService;
        this.transactionMapper = transactionMapper;
    }

    
    @PostMapping
    public ResponseEntity<Void> addTransaction(@Valid @RequestBody TransactionDto t) {
        Transaction transaction = this.transactionMapper.toModel(t);

        if(!this.transactionService.isValidTransaction(transaction)){
            return ResponseEntity.unprocessableEntity().build();
        }
        this.transactionService.addTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    
    



}


    
    







