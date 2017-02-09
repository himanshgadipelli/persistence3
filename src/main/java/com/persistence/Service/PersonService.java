package com.persistence.Service;

import com.persistence.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bobby on 2/8/2017.
 */
@Component     // Spring Component
@Transactional // Annotation driven transaction
public class PersonService {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Person person){
        // From the factory get the "current" session
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }
}
