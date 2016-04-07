package com.fjnu.domain;

/**
 * Created by spzn on 16-4-4.
 */
public class station_day_input {
    private String id;
    private String order_id;
    private String station_id;
    private String payer_id;
    private String time;
    private String type;
    private String Pname;
    private String pay_money;
    private String counter_Fee;
    private String real_output;
    private String balance;
    private String transaction_type;
    private String has_invoice;
    private String person_in_charge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(String payer_id) {
        this.payer_id = payer_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPay_money() {
        return pay_money;
    }

    public void setPay_money(String pay_money) {
        this.pay_money = pay_money;
    }

    public String getCounter_Fee() {
        return counter_Fee;
    }

    public void setCounter_Fee(String counter_Fee) {
        this.counter_Fee = counter_Fee;
    }

    public String getReal_output() { return real_output; }

    public void setReal_output(String real_output) { this.real_output = real_output; }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getHas_invoice() {
        return has_invoice;
    }

    public void setHas_invoice(String has_invoice) {
        this.has_invoice = has_invoice;
    }

    public String getPerson_in_charge() {
        return person_in_charge;
    }

    public void setPerson_in_charge(String person_in_charge) {
        this.person_in_charge = person_in_charge;
    }
}
