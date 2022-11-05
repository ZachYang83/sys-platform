package com.gpzi.gpplatform.tra_monitor.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OdTrucks implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long fid;

    private Long odersum;

    private Double ox;

    private Double oy;

    private Double dx;

    private Double dy;

    private Double x1;

    private Double y1;

    private Double xx1;

    private Double yy1;

    private Double x2;

    private Double y2;

    private Double xx2;

    private Double yy2;

    private Double x3;

    private Double y3;

    private Double xx3;

    private Double yy3;

    private Double x4;

    private Double y4;

    private Double xx4;

    private Double yy4;


}
