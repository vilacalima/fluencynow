package com.br.fluencynow.dto;

public class MensagemDTO {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getRedirectTo() {
        return redirectTo;
    }

    public void setRedirectTo(String redirectTo) {
        this.redirectTo = redirectTo;
    }

    public MensagemDTO(String message, boolean isSuccess, String redirectTo) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.redirectTo = redirectTo;
    }

    public MensagemDTO(String message, boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public String message;
    public boolean isSuccess;
    public String redirectTo;
}
