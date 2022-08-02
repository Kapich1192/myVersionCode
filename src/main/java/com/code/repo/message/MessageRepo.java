package com.code.repo.message;

import com.code.models.message.Message;
import com.code.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepo extends JpaRepository<Message, Long> {
 //   Iterable<Message> findByUserId(Long userId);
//    Iterable<Message> findBySenderId(Long senderId);
//    Iterable<Message> findByRecipientId(Long recipientId);
}
