package com.mykytam.friends.service;

import com.mykytam.friends.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {
    Iterable<Friend> findByFirstNameAndLastName (
            String firstName,
            String lastName
    );
}
