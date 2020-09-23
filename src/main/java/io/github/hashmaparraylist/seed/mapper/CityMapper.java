package io.github.hashmaparraylist.seed.mapper;

import io.github.hashmaparraylist.seed.domain.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO
 *
 * @author
 * @date 2020/9/22
 */
@Mapper
public interface CityMapper {
    /**
     *
     * @param id
     * @return
     */
    City selectCityById(Long id);
}
