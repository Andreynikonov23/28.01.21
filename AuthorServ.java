package ru.sapteh.services;

import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.Dao;
import ru.sapteh.models.Author;

import javax.management.Query;
import java.util.List;

public class AuthorServ implements Dao<Author, Long> {
    private final SessionFactory factory;
    public AuthorServ (SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public void create(Author author) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
        }
    }

    @Override
    public Author read(@NotNull final Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Author.class, id);
        }
    }
    @Override
    public List<Author> readByAll() {
        List author = null;
        try (Session session = factory.openSession()) {
            Query query =
        }
        return null;
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public void delete(Author author) {

    }
}
