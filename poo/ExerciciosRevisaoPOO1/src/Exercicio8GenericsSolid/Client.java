package Exercicio8GenericsSolid;

import java.time.LocalDate;

public class Client {
    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDate;

    public Client(String name, String rg, String cpf, LocalDate birthDate) throws Exception {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws Exception {
        if (birthDate.isAfter(LocalDate.now()) && birthDate.equals(LocalDate.now())) {
            throw new Exception("Date of birthday is greater than today!");
        }
        this.birthDate = birthDate;
    }
}
