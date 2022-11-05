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
 * @since 2021-04-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TotalOccuPop implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("V1")
    private Long v1;

    private Long time;

    private Long businessman;

    private Long taxiDriver;

    private Long student;

    private Long salariatFixed;

    private Long indiBussiness;

    private Long salariatUnfixed;

    private Long finance;

    private Long manuIndustry;

    private Long adMedia;

    private Long eduTra;

    private Long correspondence;

    private Long architecture;

    private Long service;

    private Long realEstate;

    private Long logistics;

    private Long medTreatment;

    @TableField("IT")
    private Long it;

    private Long sums;


}
