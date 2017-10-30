package com.start.mapper;

import java.util.List;

import com.start.domain.ScencData;


public interface SceneDataMapper extends com.start.mapper.BaseMapper<ScencData> {

    List<ScencData> getList( );

}
