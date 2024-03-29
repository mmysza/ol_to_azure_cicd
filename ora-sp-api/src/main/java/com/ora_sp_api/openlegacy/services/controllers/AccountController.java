package com.ora_sp_api.openlegacy.services.controllers;

import com.ora_sp_api.openlegacy.services.AccountService;
import com.ora_sp_api.openlegacy.services.AccountService.*;

import com.ora_sp_sdk.openlegacy.GetAccountById;
import com.ora_sp_sdk.openlegacy.GetAccountById.AccountObj;
import java.math.BigDecimal;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/account", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Account")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    @Operation(summary = "Account GET operation", 
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AccountOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    public AccountOut getAccount(@RequestBody AccountIn accountIn) throws Exception {
        return accountService.getAccount(accountIn);
    }
}
