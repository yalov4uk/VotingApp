package com.yalovchuk.web.controller.implementation;

import com.yalovchuk.bean.Topic;
import com.yalovchuk.dto.TopicDto;
import com.yalovchuk.resource.TopicResource;
import com.yalovchuk.service.proxy._interface.TopicProxyService;
import com.yalovchuk.service.proxy._interface.base.CrudProxyService;
import com.yalovchuk.web.controller._interface.TopicController;
import com.yalovchuk.web.controller.implementation.base.CrudControllerImpl;
import com.yalovchuk.web.utility.link._interface.TopicLinkAssembly;
import com.yalovchuk.web.utility.link._interface.base.LinkAssembly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "api/v1/topics",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class TopicControllerImpl extends CrudControllerImpl<Topic, Long, TopicDto, TopicResource>
        implements TopicController {

    @Autowired
    private TopicProxyService topicProxyService;
    @Autowired
    private TopicLinkAssembly topicLinkAssembly;

    @Override
    public CrudProxyService<Topic, Long, TopicDto, TopicResource> getService() {
        return topicProxyService;
    }

    @Override
    public LinkAssembly<Topic, Long, TopicResource> getLinkAssembly() {
        return topicLinkAssembly;
    }
}
