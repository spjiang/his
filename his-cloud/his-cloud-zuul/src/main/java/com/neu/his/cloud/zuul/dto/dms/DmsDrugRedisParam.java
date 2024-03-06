package com.neu.his.cloud.zuul.dto.dms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
public class DmsDrugRedisParam implements Serializable {

    @ApiModelProperty(value = "名称" )
    private String name;
    @ApiModelProperty(value = "药品列表" )
    private List<DmsDrugItem> druglist;

}
