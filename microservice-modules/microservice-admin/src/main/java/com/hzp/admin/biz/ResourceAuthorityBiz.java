package com.hzp.admin.biz;

import com.hzp.admin.entity.ResourceAuthority;
import com.hzp.admin.mapper.ResourceAuthorityMapper;
import com.hzp.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ace on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
