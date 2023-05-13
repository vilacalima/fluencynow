package com.br.fluencynow.dto;

public class AlterarLoginDTO {

    private String username;
    private String oldPassworld;
    private String newPassworld;
    private String newPassworldValidate;

    public AlterarLoginDTO() {

    }
    public AlterarLoginDTO(String username, String oldPassworld, String newPassworld, String newPassworldValidate) {
        this.username = username;
        this.oldPassworld = oldPassworld;
        this.newPassworld = newPassworld;
        this.newPassworldValidate = newPassworldValidate;
    }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getOldPassworld() { return oldPassworld; }
    public void setOldPassworld(String oldPassworld) { this.oldPassworld = oldPassworld; }
    public String getNewPassworld() { return newPassworld; }
    public void setNewPassworld(String newPassworld) { this.newPassworld = newPassworld; }
    public String getNewPassworldValidate() { return newPassworldValidate; }
    public void setNewPassworldValidate(String newPassworldValidate) { this.newPassworldValidate = newPassworldValidate; }

}
