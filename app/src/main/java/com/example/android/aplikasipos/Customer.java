package com.example.android.aplikasipos;

import com.orm.SugarRecord;

/**
 * Created by agungputrap on 11/17/2015.
 */
public class Customer extends SugarRecord<Customer>{

    private String firstName;
    private String lastName;
    private String email;
    private String customerGroup;
    private String SAJalan;
    private String SAKota;
    private String SAProvinsi;
    private int SAKodePos;
    private String SANegara;
    private String BAJalan;
    private String BAKota;
    private String BAProvinsi;
    private int BAKodePos;
    private String BANegara;

    public Customer() {

    }
    public Customer( String firstName, String lastName, String email, String customerGroup, String SAJalan, String SAKota, String SAProvinsi, int SAKodePos, String SANegara, String BAJalan, String BAKota, String BAProvinsi, int BAKodePos, String BANegara) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.customerGroup = customerGroup;
        this.SAJalan = SAJalan;
        this.SAKota = SAKota;
        this.SAProvinsi = SAProvinsi;
        this.SAKodePos = SAKodePos;
        this.SANegara = SANegara;
        this.BAJalan = BAJalan;
        this.BAKota = BAKota;
        this.BAProvinsi = BAProvinsi;
        this.BAKodePos = BAKodePos;
        this.BANegara = BANegara;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
    }

    public String getSAJalan() {
        return SAJalan;
    }

    public void setSAJalan(String SAJalan) {
        this.SAJalan = SAJalan;
    }

    public String getSAKota() {
        return SAKota;
    }

    public void setSAKota(String SAKota) {
        this.SAKota = SAKota;
    }

    public String getSAProvinsi() {
        return SAProvinsi;
    }

    public void setSAProvinsi(String SAProvinsi) {
        this.SAProvinsi = SAProvinsi;
    }

    public int getSAKodePos() {
        return SAKodePos;
    }

    public void setSAKodePos(int SAKodePos) {
        this.SAKodePos = SAKodePos;
    }

    public String getSANegara() {
        return SANegara;
    }

    public void setSANegara(String SANegara) {
        this.SANegara = SANegara;
    }

    public String getBAJalan() {
        return BAJalan;
    }

    public void setBAJalan(String BAJalan) {
        this.BAJalan = BAJalan;
    }

    public String getBAKota() {
        return BAKota;
    }

    public void setBAKota(String BAKota) {
        this.BAKota = BAKota;
    }

    public String getBAProvinsi() {
        return BAProvinsi;
    }

    public void setBAProvinsi(String BAProvinsi) {
        this.BAProvinsi = BAProvinsi;
    }

    public int getBAKodePos() {
        return BAKodePos;
    }

    public void setBAKodePos(int BAKodePos) {
        this.BAKodePos = BAKodePos;
    }

    public String getBANegara() {
        return BANegara;
    }

    public void setBANegara(String BANegara) {
        this.BANegara = BANegara;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
