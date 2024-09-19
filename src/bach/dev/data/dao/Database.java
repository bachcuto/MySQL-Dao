package bach.dev.data.dao;

import bach.dev.data.impl.CategoryImpl;
import bach.dev.data.impl.OrderItemImpl;
import bach.dev.data.impl.ProductImpl;
import bach.dev.data.impl.UserImpl;
import bach.dev.data.impl.OrderImpl;

public class Database extends DatabaseDao {

    @Override
    public ProductDao getProductDao() {
        // TODO Auto-generated method stub
        return (ProductDao) new ProductImpl();
    }

    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return (CategoryDao) new CategoryImpl();
    }

    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return (OrderItemDao) new OrderItemImpl();
    }

    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return (OrderDao) new OrderImpl();
    }

    @Override
    public UserDAO getUserDao() {
        // TODO Auto-generated method stub
        return (UserDAO) new UserImpl();
    }

}