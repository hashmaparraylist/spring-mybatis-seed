package io.github.hashmaparraylist.seed.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * 标准 Response 返回体
 *
 * @author Sebastian Qu
 * @date 2020/9/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResponse<T> {

    private Integer code;
    private T data;
    private String message;

    /**
     * 生成正常状态的 Response
     * @param data Payload 数据
     * @param <T> Payload 类型
     * @return 正常状态的 Response
     */
    public static <T> CommonResponse<T> ok(T data) {
        return new CommonResponse<>(HttpStatus.OK.value(), data, "");
    }
}
