package com.diool.support.repo;

import com.diool.support.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findAllByNumberAndAmountAndTheDate(Integer number, Integer amount, Date theDate);
}
