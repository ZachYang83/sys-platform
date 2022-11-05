package com.gpzi.gpplatform.public_info.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-05-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PubMarket implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String address;

    private String district;

    private String street;

    private String yyf;

    private String time;

    private String wyq;

    private String wyqs;

    private String area;

    private String shs;

    private String jypl;

    private String lxfs;

    private Double lng;

    private Double lat;


}
