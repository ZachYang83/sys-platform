package com.gpzi.gpplatform.shengfagai.entity;

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
 * @since 2022-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GongyeyuanHj implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @TableField("indId")
    private Integer indId;

    private String name;

    private Long time;

    private Long beijing;

    private Long tianjin;

    private Long hebei;

    private Long shanxi;

    private Long neimenggu;

    private Long liaoning;

    private Long jilin;

    private Long heilongjiang;

    private Long shanghai;

    private Long jiangsu;

    private Long zhejiang;

    private Long anhui;

    private Long fujian;

    private Long jiangxi;

    private Long shandong;

    private Long henan;

    private Long hubei;

    private Long hunan;

    private Long guangdong;

    private Long guangxi;

    private Long hainan;

    private Long chongqing;

    private Long sichuan;

    private Long guizhou;

    private Long yunnan;

    private Long xizang;

    private Long shannxi;

    private Long gansu;

    private Long qinghai;

    private Long ningxia;

    private Long xinjiang;

    private Double lon;

    private Double lat;


}
