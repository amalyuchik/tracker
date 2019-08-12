package com.bills.tracker.dao;

import com.bills.tracker.model.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillDao {
List<Bill> selectEveryBill(Integer i);

}
