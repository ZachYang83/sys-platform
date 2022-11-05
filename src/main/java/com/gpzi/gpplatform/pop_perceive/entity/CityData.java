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
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CityData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String city;

    private Long cntCity;

    private Long livePop;

    private Long workPop;

    private Long liveWorkPop;

    @TableField("Ave_JRradio")
    private Double aveJrradio;


}
