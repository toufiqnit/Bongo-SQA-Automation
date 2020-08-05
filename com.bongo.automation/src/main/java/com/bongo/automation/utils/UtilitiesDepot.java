package com.bongo.automation.utils;

public class UtilitiesDepot {
	
	public static final String Base_url = "https://bongobd.com/";
	public static final String Drama = "//a[contains(@class,'MuiButtonBase-root MuiListItem-root jss137 MuiListItem-button')]//span[contains(@class,'MuiTypography-root MuiListItemText-primary MuiTypography-body1')][contains(text(),'Drama')]";
	public static final String Movies = "//a[contains(@class,'MuiButtonBase-root MuiListItem-root jss137 MuiListItem-button')]//span[contains(@class,'MuiTypography-root MuiListItemText-primary MuiTypography-body1')][contains(text(),'Movies')]";
	public static final String Monpura = "//div[contains(@class,'MuiCardContent-root jss3104 jss3243')]//h6[contains(@class,'MuiTypography-root jss3105 MuiTypography-h6 MuiTypography-noWrap')][contains(text(),'Monpura')]";
	public static final String ViewAll = "//div[@id='root']/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/a/button/span";
	public static final String Independent = "//div[6]/div/button/a/div";
	public static final String Videojs = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/video-js[1]";
	public static final String Play = "//button[contains(@class,'vjs-big-play-button')]//span[contains(@class,'vjs-icon-placeholder')]";
}
