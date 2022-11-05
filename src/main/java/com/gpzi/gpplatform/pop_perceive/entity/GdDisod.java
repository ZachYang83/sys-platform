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
 * @since 2021-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GdDisod implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String ocity;

    private String odis;

    private Double olng;

    private Double olat;

    private String dcity;

    private String ddis;

    private Double dlng;

    private Double dlat;

    private String sum;


}
