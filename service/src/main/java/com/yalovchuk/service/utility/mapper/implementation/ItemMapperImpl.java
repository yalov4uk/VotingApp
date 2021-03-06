package com.yalovchuk.service.utility.mapper.implementation;

import com.yalovchuk.bean.Item;
import com.yalovchuk.dto.ItemDto;
import com.yalovchuk.resource.ItemResource;
import com.yalovchuk.service.main._interface.VotingService;
import com.yalovchuk.service.utility.mapper._interface.ItemMapper;
import com.yalovchuk.service.utility.mapper._interface.VotingMapper;
import com.yalovchuk.service.utility.mapper.implementation.base.MapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemMapperImpl extends MapperImpl<Item, Long, ItemDto, ItemResource> implements ItemMapper {

    @Autowired
    private VotingMapper votingMapper;

    @Autowired
    private VotingService votingService;

    @Override
    protected Class<Item> getBeanClass() {
        return Item.class;
    }

    @Override
    protected Class<ItemResource> getResourceClass() {
        return ItemResource.class;
    }

    @Override
    public Item dtoToBean(ItemDto beanDto) {
        Item item = super.dtoToBean(beanDto);
        if (beanDto.getVotingId() != null) item.setVoting(votingService.read(beanDto.getVotingId()));
        return item;
    }

    @Override
    public ItemResource beanToResource(Item bean) {
        ItemResource itemResource = super.beanToResource(bean);
        if (bean.getVoting() != null) itemResource.setVoting(votingMapper.beanToResource(bean.getVoting()));
        return itemResource;
    }
}
