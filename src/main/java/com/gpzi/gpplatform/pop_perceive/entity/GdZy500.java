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
public class GdZy500 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer group;

    @TableField("UID_500m")
    private Integer uid500m;

    private Integer time;

    private Integer businessman;

    private Integer taxiDriver;

    private Integer student;

    private Integer salariatFixed;

    private Integer indiBussiness;

    private Integer salariatUnfixed;

    private Integer finance;

    private Integer manuIndustry;

    private Integer adMedia;

    private Integer eduTra;

    private Integer correspondence;

    private Integer architecture;

    private Integer service;

    private Integer realEstate;

    private Integer logistics;

    private Integer medTreatment;

    @TableField("IT")
    private Integer it;

    private Integer sums;


}
