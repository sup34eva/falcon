package com.nitro.falcon.api.daos;

import com.nitro.falcon.models.User;
import javax.ejb.Local;

/**
 * UserDAO
 * @author leops
 */
@Local
public interface UserDAO {
    User findByName(final String username);
}
