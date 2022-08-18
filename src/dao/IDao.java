package dao;

public interface IDao<T> {
    T create(T t);
}
