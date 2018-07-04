package it.si2001.springangular.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import it.si2001.springangular.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractDao<PK extends Serializable, T> {


    @Autowired
    private SessionFactory sessionFactory;

    private final Class<T> persistentClass;


    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }


    protected Session getSession() {

        return sessionFactory.getCurrentSession();
    }


    public void persist(T entity) {
        String u = new Utils("Abstract DAO", "persist").toString();
        getSession().save(entity);
    }

    public void update(T entity) {
        String u = new Utils("Abstract DAO", "update").toString();
        getSession().update(entity);
    }

    public void delete(T entity) {

        getSession().delete(entity);
    }



    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {

        return (T) getSession().get(persistentClass, key);
    }


    protected Criteria createEntityCriteria() {

        return getSession().createCriteria(persistentClass);
    }

}