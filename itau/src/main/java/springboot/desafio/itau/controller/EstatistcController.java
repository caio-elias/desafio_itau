package springboot.desafio.itau.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.desafio.itau.dto.EstatistcDto;
import springboot.desafio.itau.service.TransactionService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/estatisticas")
public class EstatistcController {

     private  final TransactionService transactionService;
     

     public EstatistcController(TransactionService transactionService) {
        this.transactionService = transactionService;
       
     }


     @GetMapping
     public ResponseEntity<EstatistcDto> getEstastistics() {
        return ResponseEntity.ok().body(this.transactionService.getEstastiticas());
    
     }
     


}
