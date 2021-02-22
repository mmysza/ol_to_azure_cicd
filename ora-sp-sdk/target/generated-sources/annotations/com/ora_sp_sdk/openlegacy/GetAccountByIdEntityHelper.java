package com.ora_sp_sdk.openlegacy;

import com.ora_sp_sdk.openlegacy.GetAccountById.AccountObj;
import io.ol.core.util.DateTimeUtil;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.model.entity.RpcEntityDefinition;

final class GetAccountByIdEntityHelper {
    public static final RpcEntityDefinition entityDefinition;

    public static final RpcEntityDefinition inputEntityDefinition;

    public static final RpcEntityDefinition outputEntityDefinition;

    static {
        entityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "b86c1408-ad6f-41ae-8c35-a7c196dad076",
                "GetAccountById",
                "com.ora_sp_sdk.openlegacy.GetAccountById",
                "Get Account By Id",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("accId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "accId",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                22,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "ACC_ID",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("statusCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "statusCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                "STATUS_CODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                put("db.registerOutputParameter", "true");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("account", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "account",
                "com.ora_sp_sdk.openlegacy.GetAccountById.AccountObj",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                300,
                false,
                new java.util.HashMap<String, String>() {{
                put("db.typeName", "DEMO.ACCOUNT_OBJ");
                put("db.type", "2002");
                put("db.useTypeName", "true");
                put("db.registerOutputParameter", "true");
                }},
                "ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("accountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "accountId",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "ACCOUNT_ID",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("accountNumber", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accountNumber",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACCOUNT_NUMBER",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("fullName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "fullName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "FULL_NAME",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("email", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "email",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "EMAIL",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("iban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "iban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "IBAN",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("creditCardType", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "creditCardType",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "CREDIT_CARD_TYPE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accCurrencyCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accCurrencyCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACC_CURRENCY_CODE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("balance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "balance",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "BALANCE",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("creattionDate", new org.openlegacy.core.model.field.RpcDateFieldDefinition(
                "creattionDate",
                "java.sql.Timestamp",
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "CREATTION_DATE",
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "93");
                }},
                "en",
                "UTC",
                "yyyy-MM-dd hh:mm:ss",
                false,
                null
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DEMO.BANK_EXAMPLE.GET_ACCOUNT_BY_ID",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        inputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "b86c1408-ad6f-41ae-8c35-a7c196dad076",
                "GetAccountById",
                "com.ora_sp_sdk.openlegacy.GetAccountById",
                "Get Account By Id",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("accId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "accId",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                22,
                false,
                org.openlegacy.core.annotations.rpc.Direction.INPUT,
                "ACC_ID",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("statusCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "statusCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                "STATUS_CODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                put("db.registerOutputParameter", "true");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("account", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "account",
                "com.ora_sp_sdk.openlegacy.GetAccountById.AccountObj",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                300,
                false,
                new java.util.HashMap<String, String>() {{
                put("db.typeName", "DEMO.ACCOUNT_OBJ");
                put("db.type", "2002");
                put("db.useTypeName", "true");
                put("db.registerOutputParameter", "true");
                }},
                "ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("accountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "accountId",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "ACCOUNT_ID",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("accountNumber", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accountNumber",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACCOUNT_NUMBER",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("fullName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "fullName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "FULL_NAME",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("email", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "email",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "EMAIL",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("iban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "iban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "IBAN",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("creditCardType", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "creditCardType",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "CREDIT_CARD_TYPE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accCurrencyCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accCurrencyCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACC_CURRENCY_CODE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("balance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "balance",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "BALANCE",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("creattionDate", new org.openlegacy.core.model.field.RpcDateFieldDefinition(
                "creattionDate",
                "java.sql.Timestamp",
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "CREATTION_DATE",
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "93");
                }},
                "en",
                "UTC",
                "yyyy-MM-dd hh:mm:ss",
                false,
                null
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DEMO.BANK_EXAMPLE.GET_ACCOUNT_BY_ID",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
        outputEntityDefinition = new org.openlegacy.core.model.entity.RpcEntityDefinitionImpl(
                "b86c1408-ad6f-41ae-8c35-a7c196dad076",
                "GetAccountById",
                "com.ora_sp_sdk.openlegacy.GetAccountById",
                "Get Account By Id",
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("statusCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "statusCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                "STATUS_CODE",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                put("db.registerOutputParameter", "true");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("account", new org.openlegacy.core.model.field.RpcClassFieldDefinition(
                "account",
                "com.ora_sp_sdk.openlegacy.GetAccountById.AccountObj",
                "",
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                300,
                false,
                new java.util.HashMap<String, String>() {{
                put("db.typeName", "DEMO.ACCOUNT_OBJ");
                put("db.type", "2002");
                put("db.useTypeName", "true");
                put("db.registerOutputParameter", "true");
                }},
                "ACCOUNT",
                org.openlegacy.core.annotations.rpc.Direction.INPUT_OUTPUT,
                null,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                null,
                null,
                new java.util.LinkedHashMap<String, org.openlegacy.core.model.field.RpcFieldDefinition>() {{
                put("accountId", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "accountId",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "ACCOUNT_ID",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("accountNumber", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accountNumber",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACCOUNT_NUMBER",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("fullName", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "fullName",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "FULL_NAME",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("email", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "email",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "EMAIL",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("iban", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "iban",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "IBAN",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("creditCardType", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "creditCardType",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "CREDIT_CARD_TYPE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("accCurrencyCode", new org.openlegacy.core.model.field.RpcStringFieldDefinition(
                "accCurrencyCode",
                "java.lang.String",
                "",
                "",
                false,
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                50,
                false,
                "ACC_CURRENCY_CODE",
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "12");
                }},
                null,
                org.openlegacy.core.annotations.PaddingType.NONE,
                ""
                ));
                put("balance", new org.openlegacy.core.model.field.RpcNumberFieldDefinition(
                "balance",
                "java.math.BigDecimal",
                -1.7976931348623157E308,
                1.7976931348623157E308,
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                null,
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "BALANCE",
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "2");
                }},
                null,
                0,
                0
                ));
                put("creattionDate", new org.openlegacy.core.model.field.RpcDateFieldDefinition(
                "creattionDate",
                "java.sql.Timestamp",
                "",
                null,
                "org.openlegacy.core.model.field.RpcFieldType.General",
                false,
                0,
                false,
                org.openlegacy.core.annotations.rpc.Direction.OUTPUT,
                "CREATTION_DATE",
                null,
                "org.openlegacy.core.model.legacy.type.NoneLegacyType",
                new java.util.HashMap<String, String>() {{
                put("db.type", "93");
                }},
                "en",
                "UTC",
                "yyyy-MM-dd hh:mm:ss",
                false,
                null
                ));
                }}
                ));
                }},
                null,
                new java.util.HashMap<String, String>() {{}},
                java.util.Arrays.asList(new org.openlegacy.core.model.entity.RpcActionDefinition[]{
                new org.openlegacy.core.model.entity.RpcActionDefinition(
                new org.openlegacy.core.rpc.actions.RpcActions.EXECUTE(),
                "execute",
                "Execute",
                "DEMO.BANK_EXAMPLE.GET_ACCOUNT_BY_ID",
                new java.util.HashMap<String, String>() {{}}
                )
                }),
                java.util.Arrays.asList(new java.lang.String[]{}),
                "",
                org.openlegacy.core.definitions.BackendSolution.OTHER
                );
    }

    private static GetAccountById.AccountObj fromGetAccountByIdAccountObjJsonObject(
            JsonObject jsonObject, GetAccountById.AccountObj account) {
        String accountIdStringValue = jsonObject.getString("accountId");
        if (accountIdStringValue != null) {
            account.setAccountId(new BigDecimal(accountIdStringValue));
        }
        account.setAccountNumber(jsonObject.getString("accountNumber"));
        account.setFullName(jsonObject.getString("fullName"));
        account.setEmail(jsonObject.getString("email"));
        account.setIban(jsonObject.getString("iban"));
        account.setCreditCardType(jsonObject.getString("creditCardType"));
        account.setAccCurrencyCode(jsonObject.getString("accCurrencyCode"));
        String balanceStringValue = jsonObject.getString("balance");
        if (balanceStringValue != null) {
            account.setBalance(new BigDecimal(balanceStringValue));
        }
        account.setCreattionDate(new java.sql.Timestamp(DateTimeUtil.INSTANCE.parseDate(jsonObject.getString("creattionDate"), "yyyy-MM-dd hh:mm:ss", "en", "UTC").getTime()));
        return account;
    }

    public static void populateFromJson(@NotNull JsonObject jsonObject,
            @NotNull GetAccountById entity) {
        Objects.requireNonNull(entity, "provided entity should not be null");
        if (jsonObject != null) {
            String accIdStringValue = jsonObject.getString("accId");
            if (accIdStringValue != null) {
                entity.setAccId(new BigDecimal(accIdStringValue));
            }
            entity.setStatusCode(jsonObject.getString("statusCode"));
            JsonObject accountObject = jsonObject.getJsonObject("account");
            if (accountObject != null) {
                entity.setAccount(fromGetAccountByIdAccountObjJsonObject(accountObject, new GetAccountById.AccountObj()));
            }
        }
    }

    private static JsonObject initAccountObj(AccountObj object) {
        JsonObject jsonObject = new JsonObject();
        BigDecimal accountId = object.getAccountId();
        jsonObject.put("accountId", (accountId != null) ?  accountId.toString() : (Object) null );
        jsonObject.put("accountNumber", object.getAccountNumber());
        jsonObject.put("fullName", object.getFullName());
        jsonObject.put("email", object.getEmail());
        jsonObject.put("iban", object.getIban());
        jsonObject.put("creditCardType", object.getCreditCardType());
        jsonObject.put("accCurrencyCode", object.getAccCurrencyCode());
        BigDecimal balance = object.getBalance();
        jsonObject.put("balance", (balance != null) ?  balance.toString() : (Object) null );
        String creattionDateDate = DateTimeUtil.INSTANCE.toFormattedDate(object.getCreattionDate(), "yyyy-MM-dd hh:mm:ss", "en", "UTC");
        jsonObject.put("creattionDate", (creattionDateDate == null) ? (Object) null : creattionDateDate);
        return jsonObject;
    }

    public static JsonObject toJson(GetAccountById entity) {
        JsonObject jsonObject = new JsonObject();
        if (entity != null) {
            BigDecimal accId = entity.getAccId();
            jsonObject.put("accId", (accId != null) ?  accId.toString() : (Object) null );
            jsonObject.put("statusCode", entity.getStatusCode());
            AccountObj account = entity.getAccount();
            if (account != null) {
                jsonObject.put("account", initAccountObj(account));
            } else {
                jsonObject.put("account", (Object) null);
            }
        }
        return jsonObject;
    }
}
