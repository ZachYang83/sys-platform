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
public class GdHj500 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer sb;

    @TableField("UID_500m")
    private Integer uid500m;

    private Integer time;

    private Integer beijing;

    private Integer tianjin;

    private Integer hebei;

    private Integer shanxi;

    private Integer neimenggu;

    private Integer liaoning;

    private Integer jilin;

    private Integer heilongjiang;

    private Integer shanghai;

    private Integer jiangsu;

    private Integer zhejiang;

    private Integer anhui;

    private Integer fujian;

    private Integer jiangxi;

    private Integer shandong;

    private Integer henan;

    private Integer hubei;

    private Integer hunan;

    private Integer guangdong;

    private Integer guangxi;

    private Integer hainan;

    private Integer chongqing;

    private Integer sichuan;

    private Integer guizhou;

    private Integer yunnan;

    private Integer xizang;

    @TableField("SX")
    private Integer sx;

    private Integer gansu;

    private Integer qinghai;

    private Integer ningxia;

    private Integer xinjiang;


}
