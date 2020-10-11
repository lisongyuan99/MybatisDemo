package cn.lsy99.wxmp.demo.entity.mb;

import lombok.*;

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class News {
    private int id;
    private String title;
    private String img;
    private String content;
}
