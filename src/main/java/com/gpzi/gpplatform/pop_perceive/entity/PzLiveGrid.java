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
public class PzLiveGrid implements Serializable {

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

    private Integer xianggang;

    private Integer nl011;

    private Integer nl1215;

    private Integer nl1618;

    private Integer nl1922;

    private Integer nl2325;

    private Integer nl2635;

    private Integer nl3645;

    private Integer nl4655;

    private Integer nl5665;

    private Integer nl65over;

    private Integer qita;

    private Integer chuzhong;

    private Integer boshi;

    private Integer zhuanke;

    private Integer benke;

    private Integer xiaoxue;

    private Integer gaozhong;

    private Integer shuoshi;


}
