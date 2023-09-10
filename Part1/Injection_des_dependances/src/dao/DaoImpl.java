package dao;

public class DaoImpl implements IDAO{
    @Override
    public double getData() {
       return  Math.random()*40;
    }
}
