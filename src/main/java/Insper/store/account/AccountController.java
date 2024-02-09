package Insper.store.account;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface AccountController{

    @PostMapping("/accounts")
    public ResponseEntity<AccountOut> create(
        @RequestBody(required = true) AccountIn in
        );

    @PutMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> update(string id, AccountIn accountIn);
}