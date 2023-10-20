package com.example.emb.global.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum GlobalErrorCode {

    // 401
    EXPIRED_JWT(401, "Expired Jwt"),
    INVALID_JWT(401, "Invalid Jwt"),
    PASSWORD_MISMATCH(401,  "Password Mismatch"),
    INVALID_CODE(401, "Invalid Code"),

    // 403
    FORBIDDEN(403, "FORBIDDEN"),
    NOT_VALID_USER_ROLE(403, "Not Valid User Role"),
    NOT_VALID_USER(403, "Not Valid User"),

    // 404
    USER_NOT_FOUND(404, "User Not Found"),
    REFRESH_TOKEN_NOT_FOUND(404, "RefreshToken Not Found"),
    USER_AUTH_CODE_NOT_FOUND(404, "User AuthCode Not Found"),


    // 409
    ALREADY_USER_EXIST(409, "Already User Exist"),
    ALREADY_ID_EXISTS(409, "Already ID Exist"),
    ALREADY_AUTH_CODE_EXIST(409, "Already Auth Code Exist"),

    // 500
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String message;

}
