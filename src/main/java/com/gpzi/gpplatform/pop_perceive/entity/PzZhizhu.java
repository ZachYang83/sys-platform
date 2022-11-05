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
 * @since 2022-10-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PzZhizhu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer netId;

    private Integer work2019;

    private Integer work2022;

    private Integer live2019;

    private Integer live2022;

    private Double lon;

    private Double lat;


}
