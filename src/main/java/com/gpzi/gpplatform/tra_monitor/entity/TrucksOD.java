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
 * @since 2021-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TrucksOD implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Double oLon;

    private Double oLat;

    private Double dLon;

    private Double dLat;


}
