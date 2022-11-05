package com.gpzi.gpplatform.pop_perceive.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GdNl500 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("UID_500m")
    private Long uid500m;

    private Integer sb;

    private Integer time;

    private Integer totalPop;

    private Integer betw611;

    private Integer betw1215;

    private Integer betw1618;

    private Integer betw1922;

    private Integer betw2325;

    private Integer betw2634;

    private Integer betw3545;

    private Integer betw4655;

    private Integer betw5665;

    private Integer above65;


}
