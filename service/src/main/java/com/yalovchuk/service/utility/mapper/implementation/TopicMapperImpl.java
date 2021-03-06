package com.yalovchuk.service.utility.mapper.implementation;

import com.yalovchuk.bean.Topic;
import com.yalovchuk.dto.TopicDto;
import com.yalovchuk.resource.TopicResource;
import com.yalovchuk.service.utility.mapper._interface.TopicMapper;
import com.yalovchuk.service.utility.mapper.implementation.base.MapperImpl;
import org.springframework.stereotype.Service;

@Service
public class TopicMapperImpl extends MapperImpl<Topic, Long, TopicDto, TopicResource> implements TopicMapper {

    @Override
    protected Class<Topic> getBeanClass() {
        return Topic.class;
    }

    @Override
    protected Class<TopicResource> getResourceClass() {
        return TopicResource.class;
    }
}
