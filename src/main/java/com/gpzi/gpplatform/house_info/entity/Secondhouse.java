package com.gpzi.gpplatform.house_info.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Secondhouse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Double lng;

    private Double lat;

    private String name;

    private Integer sum;

    private String area;

    private Long price;

    private String cq;

    private String time;

    private String fwyt;

    private String direction;

    private Integer gpprice;

    private String lcs;

    private String lc;

    private String jcnd;

    private String jzjg;

    private String jzlx;


}
