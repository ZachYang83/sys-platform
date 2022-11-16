package com.gpzi.gpplatform.shengfagai.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2022-11-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiuruQx implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cityid;

    private String city;

    private String county;

    private Double mon2;

    private Double mon3;

    private Double mon4;

    private Double mon5;

    private Double mon6;

    private Double mon7;

    private Double mon8;

    private Double mon9;

    private Double mon10;

    private Double temp;


}
