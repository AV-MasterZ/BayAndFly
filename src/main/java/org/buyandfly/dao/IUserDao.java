package org.buyandfly.dao;

import org.buyandfly.model.User;

import java.util.List;

public interface IUserDao {
    User getById(final long id);
    User getByLogin(final String login);
    List<User> getAll();
    void add(final User t);
    void edit(final User t);
    void delete(final User t);
}