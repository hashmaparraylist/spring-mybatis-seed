package io.github.hashmaparraylist.seed.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
