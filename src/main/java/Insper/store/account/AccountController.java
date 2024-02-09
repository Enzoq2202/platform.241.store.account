package Insper.store.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface AccountController{

    @PostMapping("/accounts")
    public ResponseEntity<AccountOut> create(
        @RequestBody(required = true) AccountIn in
        );

    @PutMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> update(String id, AccountIn accountIn);
}