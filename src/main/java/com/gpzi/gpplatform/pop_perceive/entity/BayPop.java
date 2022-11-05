package com.gpzi.gpplatform.pop_perceive.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2021-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BayPop implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Double lon;

    private Double lat;

    private Long sums;


}
