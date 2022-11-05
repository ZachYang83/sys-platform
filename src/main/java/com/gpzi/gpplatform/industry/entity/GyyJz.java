package com.gpzi.gpplatform.industry.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gpzi
 * @since 2022-11-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GyyJz implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String gridids;


}
