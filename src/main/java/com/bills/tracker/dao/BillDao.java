package com.bills.tracker.dao;

import com.bills.tracker.model.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

public interface BillDao {
    String getString();

    List<Bill> selectEveryBill();
}
