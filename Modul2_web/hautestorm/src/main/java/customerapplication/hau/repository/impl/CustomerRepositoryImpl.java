package customerapplication.hau.repository.impl;

import customerapplication.hau.model.Customer;
import customerapplication.hau.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }



    @Override
    public void save(Customer model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(long id) {
        Customer customer = findById(id);
        if (customer != null) {
            em.remove(customer);
        }
    }


}