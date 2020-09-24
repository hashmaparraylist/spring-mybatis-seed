package io.github.hashmaparraylist.seed.web;

import io.github.hashmaparraylist.seed.domain.City;
import io.github.hashmaparraylist.seed.domain.dto.CommonResponse;
import io.github.hashmaparraylist.seed.mapper.CityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * City 接口
 *
 * @author Sebastian Qu
 * @date 2020/9/22
 */
@RestController
@Slf4j
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
    @ResponseBody
    public CommonResponse<City> getCity(@RequestParam("id") Long id) {
        City city = this.cityMapper.selectCityById(id);
        return CommonResponse.ok(city);
    }

    @GetMapping("/cities2")
    @ResponseBody
    public Callable<CommonResponse<City>> getCity2(@RequestParam("id") Long id) {
        return new Callable<CommonResponse<City>>() {
            @Override
            public CommonResponse<City> call() throws Exception {
                City city = cityMapper.selectCityById(id);
                return CommonResponse.ok(city);
            }
        };
    }

}
