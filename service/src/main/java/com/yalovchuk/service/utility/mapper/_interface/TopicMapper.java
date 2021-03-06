package com.yalovchuk.service.utility.mapper._interface;

import com.yalovchuk.bean.Topic;
import com.yalovchuk.dto.TopicDto;
import com.yalovchuk.resource.TopicResource;
import com.yalovchuk.service.utility.mapper._interface.base.Mapper;

public interface TopicMapper extends Mapper<Topic, Long, TopicDto, TopicResource> {
}
