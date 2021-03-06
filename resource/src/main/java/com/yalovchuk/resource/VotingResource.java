package com.yalovchuk.resource;

import com.yalovchuk.bean.Voting;
import com.yalovchuk.resource.base.NamedBeanResource;

public class VotingResource extends NamedBeanResource<Voting, Long> {

    private Boolean enable;
    private TopicResource topic;

    public VotingResource() {
        super();
    }

    public VotingResource(Long id, String name, Boolean enable, TopicResource topic) {
        super(id, name);
        this.enable = enable;
        this.topic = topic;
    }

    public VotingResource(Voting voting, TopicResource topic) {
        super(voting);
        this.enable = voting.getEnable();
        this.topic = topic;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public TopicResource getTopic() {
        return topic;
    }

    public void setTopic(TopicResource topic) {
        this.topic = topic;
    }
}
