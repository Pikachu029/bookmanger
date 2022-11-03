package com.pikachu.bookmanger.biz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: 橙子
 * @Date: 2022/11/3 22:34
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String name;
}
