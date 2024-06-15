package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface OrderDitailDAO {
    public boolean addOrderDetails(String orderId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;
    public boolean saveOrderDetail(String id ,OrderDetailDTO orderDetailDTO) throws SQLException ;
}
