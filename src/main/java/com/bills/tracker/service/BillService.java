package com.bills.tracker.service;

import com.bills.tracker.model.Bill;

import java.util.List;

public interface BillService {
    List<Bill> selectEveryBill(Integer i);
}
