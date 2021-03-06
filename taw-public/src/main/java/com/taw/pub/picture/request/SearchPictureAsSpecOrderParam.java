package com.taw.pub.picture.request;

import com.hawk.utility.check.CheckEnum;
import com.hawk.utility.check.CheckNull;
import com.taw.pub.picture.enums.EnumSearchPictureOrder;

public class SearchPictureAsSpecOrderParam {
	
	
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Long getSceneId() {
		return sceneId;
	}
	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}
	@CheckNull
	private Integer offset;
	@CheckNull
	private Integer limit;
	@CheckNull
	private Long sceneId;
	@CheckNull
	@CheckEnum(parser=EnumSearchPictureOrder.class)
	private String orderBy;

}
