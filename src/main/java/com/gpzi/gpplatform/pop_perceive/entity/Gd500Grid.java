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
 * @since 2021-04-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Gd500Grid implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("UID_500m")
    private Long uid500m;

    private Double lon;

    private Double lat;


}
