package io.github.hashmaparraylist.seed.web;

import io.github.hashmaparraylist.seed.domain.City;
import io.github.hashmaparraylist.seed.domain.dto.CommonResponse;
import io.github.hashmaparraylist.seed.mapper.CityMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * City 接口
 *
 * @author Sebastian Qu
 * @date 2020/9/22
 */
@RestController
public class CityRestController {

    private final CityMapper cityMapper;
    public CityRestController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    /**
     * 根据 ID 获取 City 对象
     * @param id ID
     * @return City 对象
     */
    @GetMapping("/cities")
    public ResponseEntity<CommonResponse<City>> getCity(@RequestParam("id") Long id) {
        City city = this.cityMapper.selectCityById(id);
        return ResponseEntity.ok(CommonResponse.ok(city));
    }

}
