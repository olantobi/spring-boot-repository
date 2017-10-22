/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.testproject.repo;

import com.liferon.testproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author olanrewaju.ebenezer
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
