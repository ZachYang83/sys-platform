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
 * @since 2021-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PubinfoCity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String type;

    private Integer count;


}
