package com.gpzi.gpplatform.pop_perceive.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2022-10-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PzWorkGrid implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private Integer Id;

    private Integer beijing;

    private Integer tianjin;

    private Integer hebei;

    private Integer shanxi;

    private Integer neimenggu;

    private Integer liaoning;

    private Integer jilin;

    private Integer heilongjia;

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

    private Integer shannxi;

    private Integer gansu;

    private Integer qinghai;

    private Integer ningxia;

    private Integer xinjiang;

    private Integer nl020;

    private Integer nl2030;

    private Integer nl3040;

    private Integer nl4050;

    private Integer nl5060;

    private Integer nl60over;

    private Integer jiaotong;

    private Integer zhusu;

    private Integer xinxi;

    private Integer gonggong;

    private Integer nlmy;

    private Integer zhizao;

    private Integer weisheng;

    private Integer jumin;

    private Integer jianzhu;

    private Integer fangdi;

    private Integer pifa;

    private Integer jiaoyu;

    private Integer wenhua;

    private Integer shuili;

    private Integer dianli;

    private Integer kexue;

    private Integer zulin;

    private Integer jinrong;

    private Integer qita;

    private Integer chuzhong;

    private Integer boshi;

    private Integer zhuanke;

    private Integer benke;

    private Integer xiaoxue;

    private Integer gaozhong;

    private Integer shuoshi;


}
