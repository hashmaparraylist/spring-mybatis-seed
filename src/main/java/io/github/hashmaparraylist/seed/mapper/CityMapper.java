package io.github.hashmaparraylist.seed.mapper;

import io.github.hashmaparraylist.seed.domain.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * City Entity MyBatis Mapper
 *
 * @author
 * @date 2020/9/22
 */
@Mapper
public interface CityMapper {
    /**
     * 根据 ID 获取 City 对象
     * @param id ID
     * @return City 对象
     */
    City selectCityById(Long id);
}
