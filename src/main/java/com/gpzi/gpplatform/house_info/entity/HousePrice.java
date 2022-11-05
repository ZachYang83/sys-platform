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
 * @since 2021-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HousePrice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer price;

    private String time;

    private String jzjg;

    private String jzlx;

    private String lhl;

    private String rjl;

    private String chanquan;

    private String ldzs;

    private String lwzs;

    private String zdarea;

    private String jzarea;

    private Double lng;

    private Double lat;


}
