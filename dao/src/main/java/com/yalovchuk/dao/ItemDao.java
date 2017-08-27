package com.yalovchuk.dao;

import com.yalovchuk.bean.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemDao extends CrudRepository<Item, Long> {

    void deleteByVotingTopicIdAndVotingIdAndId(Long topicId, Long votingId, Long itemId);

    void deleteAllByVotingTopicIdAndVotingId(Long topicId, Long votingId);

    List<Item> getAllByVotingTopicIdAndVotingId(Long topicId, Long votingId);
}
