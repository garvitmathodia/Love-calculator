package com.love.calculator.model.attribute.method.level;

public class WebsiteInfoDTO {

	private String webSiteName;
	private String webSiteCategory;
	
	
	public WebsiteInfoDTO() {
		System.out.println("WebsiteInfoDTO Constructor Called");
	}
	
	public String getWebSiteName() {
		return webSiteName;
	}
	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}
	public String getWebSiteCategory() {
		return webSiteCategory;
	}
	public void setWebSiteCategory(String webSiteCategory) {
		this.webSiteCategory = webSiteCategory;
	}
	
}
